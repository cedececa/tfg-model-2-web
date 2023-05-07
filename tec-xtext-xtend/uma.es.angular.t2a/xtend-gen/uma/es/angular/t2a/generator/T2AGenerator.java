/**
 * generated by Xtext 2.26.0
 */
package uma.es.angular.t2a.generator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uma.es.angular.t2a.t2A.Comp;
import uma.es.angular.t2a.t2A.Element;
import uma.es.angular.t2a.t2A.Page;
import uma.es.angular.t2a.t2A.Root;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class T2AGenerator extends AbstractGenerator {
  public void deleteDirectoryContent(final String path) {
    final File dest = new File(path);
    try {
      FileUtils.deleteDirectory(dest);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  /**
   * For the absolute path of the generated files
   */
  public String getSRCGenDirectoryAbsolutePath(final IFileSystemAccess2 fsa) {
    String fileName = "dummy.txt";
    fsa.generateFile(fileName, "dummy content");
    final URI uri = URI.createURI(fsa.getURI("dummy.txt").toString());
    String _xifexpression = null;
    boolean _isFile = uri.isFile();
    if (_isFile) {
      _xifexpression = Paths.get(uri.toFileString()).getParent().toString();
    } else {
      String _xifexpression_1 = null;
      boolean _isPlatform = uri.isPlatform();
      if (_isPlatform) {
        _xifexpression_1 = ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile().getAbsolutePath();
      } else {
        String _scheme = uri.scheme();
        String _plus = ("Unsupported URI scheme: " + _scheme);
        throw new IllegalArgumentException(_plus);
      }
      _xifexpression = _xifexpression_1;
    }
    final String outputDir = _xifexpression;
    fsa.deleteFile(fileName);
    String relativePath = uri.toPlatformString(true);
    relativePath = relativePath.replace("/", "\\").replace(("\\" + fileName), "");
    System.out.println((outputDir + relativePath));
    return (outputDir + relativePath);
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String absoluteSrcGenDirectory = this.getSRCGenDirectoryAbsolutePath(fsa);
    this.deleteDirectoryContent(absoluteSrcGenDirectory);
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    Root root = ((Root) _head);
    ArrayList<Comp> components = new ArrayList<Comp>();
    ArrayList<Page> pages = new ArrayList<Page>();
    EList<Element> _elements = root.getElements();
    for (final Element element : _elements) {
      {
        boolean _equals = element.eClass().getName().equals("Page");
        if (_equals) {
          Page page = ((Page) element);
          AngularPage.generatePageFiles(page, fsa);
          pages.add(page);
          boolean _isHome = page.isHome();
          boolean _equals_1 = (_isHome == true);
          if (_equals_1) {
            AppModule.generarModule(fsa, page);
          }
        }
        boolean _equals_2 = element.eClass().getName().equals("Comp");
        if (_equals_2) {
          Comp comp = ((Comp) element);
          AngularComponent.generateComponentFiles(comp, fsa);
          components.add(comp);
        }
      }
    }
    AppRoot.generarRoot(fsa, pages);
    ComponentModule.generarModule(fsa, components);
    PageModule.generarModule(fsa, pages);
    this.runAngularProject(absoluteSrcGenDirectory);
  }
  
  public String className(final Resource res) {
    String name = res.getURI().lastSegment();
    return name.substring(0, name.indexOf("."));
  }
  
  public void runAngularProject(final String srcGenDirectoryAbsolutePath) {
    AngularRunner.run(srcGenDirectoryAbsolutePath);
  }
}
