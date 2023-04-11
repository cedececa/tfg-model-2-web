/**
 * generated by Xtext 2.26.0
 */
package uma.es.angular.t2a.generator;

import java.nio.file.Paths;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uma.es.angular.t2a.t2A.Comp;
import uma.es.angular.t2a.t2A.Element;
import uma.es.angular.t2a.t2A.Feature;
import uma.es.angular.t2a.t2A.InstanceEDOMFeature;
import uma.es.angular.t2a.t2A.InstanciaEDOM;
import uma.es.angular.t2a.t2A.Page;
import uma.es.angular.t2a.t2A.PageFeature;
import uma.es.angular.t2a.t2A.Root;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class T2AGenerator extends AbstractGenerator {
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
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    Root root = ((Root) _head);
    EList<Element> _elements = root.getElements();
    for (final Element element : _elements) {
      {
        boolean _equals = element.eClass().getName().equals("Page");
        if (_equals) {
          this.generateClassFile(((Page) element), fsa);
        }
        boolean _equals_1 = element.eClass().getName().equals("Comp");
        if (_equals_1) {
          this.generateClassFile(((Comp) element), fsa);
        }
      }
    }
    this.runAngularProject(this.getSRCGenDirectoryAbsolutePath(fsa));
  }
  
  public void generateClassFile(final Page page, final IFileSystemAccess2 fsa) {
    String _name = page.getName();
    String nameLowercase = new String(_name).toLowerCase();
    fsa.generateFile((((nameLowercase + "/") + nameLowercase) + ".page.ts"), this.toTSCode(page));
    fsa.generateFile((((nameLowercase + "/") + nameLowercase) + ".page.html"), this.toHTMLCode(page));
  }
  
  public void generateClassFile(final Comp comp, final IFileSystemAccess2 fsa) {
    String _name = comp.getName();
    String nameLowercase = new String(_name).toLowerCase();
    fsa.generateFile((((nameLowercase + "/") + nameLowercase) + ".comp.ts"), this.toTSCode(comp));
    fsa.generateFile((((nameLowercase + "/") + nameLowercase) + ".comp.html"), this.toHTMLCode(comp));
  }
  
  public String className(final Resource res) {
    String name = res.getURI().lastSegment();
    return name.substring(0, name.indexOf("."));
  }
  
  public CharSequence toTSCode(final Comp comp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Component({");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("selector: \'");
    String _name = comp.getName();
    _builder.append(_name, "\t");
    _builder.append("\',");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("templateUrl: \'");
    String _name_1 = comp.getName();
    _builder.append(_name_1, "\t");
    _builder.append(".comp.html\',");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("styleUrls:[\'");
    String _name_2 = comp.getName();
    _builder.append(_name_2, "\t");
    _builder.append(".comp.scss\']\t");
    _builder.newLineIfNotEmpty();
    _builder.append("})");
    _builder.newLine();
    _builder.append("export class Comp");
    String _name_3 = comp.getName();
    _builder.append(_name_3);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toTSCode(final Page page) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Component({");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("selector: \'");
    String _name = page.getName();
    _builder.append(_name, "\t");
    _builder.append("\',");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("templateUrl: \'");
    String _name_1 = page.getName();
    _builder.append(_name_1, "\t");
    _builder.append(".page.html\',");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("styleUrls:[\'");
    String _name_2 = page.getName();
    _builder.append(_name_2, "\t");
    _builder.append(".page.scss\']\t");
    _builder.newLineIfNotEmpty();
    _builder.append("})");
    _builder.newLine();
    _builder.append("export class Page");
    String _name_3 = page.getName();
    _builder.append(_name_3);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toHTMLCode(final Comp comp) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Feature> _features = comp.getFeatures();
      for(final Feature feature : _features) {
        Feature f = ((Feature) feature);
        _builder.newLineIfNotEmpty();
        {
          InstanciaEDOM _instanciaEDOM = f.getInstanciaEDOM();
          boolean _tripleNotEquals = (_instanciaEDOM != null);
          if (_tripleNotEquals) {
            CharSequence _hTMLCodeForInstanciaEDOM = this.toHTMLCodeForInstanciaEDOM(f.getInstanciaEDOM());
            _builder.append(_hTMLCodeForInstanciaEDOM);
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _isAllowSlot = f.isAllowSlot();
          if (_isAllowSlot) {
            _builder.append("<ng-content>");
            _builder.newLine();
            _builder.append("</ng-content>");
            _builder.newLine();
          }
        }
        {
          String _string = f.getString();
          boolean _tripleNotEquals_1 = (_string != null);
          if (_tripleNotEquals_1) {
            String _string_1 = f.getString();
            _builder.append(_string_1);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence toHTMLCode(final Page page) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<PageFeature> _pageFeatures = page.getPageFeatures();
      for(final PageFeature pageFeature : _pageFeatures) {
        PageFeature pf = ((PageFeature) pageFeature);
        _builder.newLineIfNotEmpty();
        {
          InstanciaEDOM _instanciaEDOM = pf.getInstanciaEDOM();
          boolean _tripleNotEquals = (_instanciaEDOM != null);
          if (_tripleNotEquals) {
            CharSequence _hTMLCodeForInstanciaEDOM = this.toHTMLCodeForInstanciaEDOM(pf.getInstanciaEDOM());
            _builder.append(_hTMLCodeForInstanciaEDOM);
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _string = pf.getString();
          boolean _tripleNotEquals_1 = (_string != null);
          if (_tripleNotEquals_1) {
            String _string_1 = pf.getString();
            _builder.append(_string_1);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence toHTMLCodeForInstanciaEDOM(final InstanciaEDOM instanciaEDOM) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    String _name = instanciaEDOM.getInstancia().getName();
    _builder.append(_name);
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<InstanceEDOMFeature> _insfeatures = instanciaEDOM.getInsfeatures();
      for(final InstanceEDOMFeature insfeature : _insfeatures) {
        _builder.append("\t");
        InstanceEDOMFeature insf = ((InstanceEDOMFeature) insfeature);
        _builder.newLineIfNotEmpty();
        {
          InstanciaEDOM _instanciaEDOM = insf.getInstanciaEDOM();
          boolean _tripleNotEquals = (_instanciaEDOM != null);
          if (_tripleNotEquals) {
            _builder.append("\t");
            Object _hTMLCodeForInstanciaEDOM = this.toHTMLCodeForInstanciaEDOM(insf.getInstanciaEDOM());
            _builder.append(_hTMLCodeForInstanciaEDOM, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _string = insf.getString();
          boolean _tripleNotEquals_1 = (_string != null);
          if (_tripleNotEquals_1) {
            _builder.append("\t");
            String _string_1 = insf.getString();
            _builder.append(_string_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("</");
    String _name_1 = instanciaEDOM.getInstancia().getName();
    _builder.append(_name_1);
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public void runAngularProject(final String srcGenDirectoryAbsolutePath) {
    AngularRunner.AngularRunner(srcGenDirectoryAbsolutePath);
  }
}
