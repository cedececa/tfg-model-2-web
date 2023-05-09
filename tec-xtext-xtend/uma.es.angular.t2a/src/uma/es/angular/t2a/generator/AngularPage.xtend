package uma.es.angular.t2a.generator

import uma.es.angular.t2a.t2A.Page
import uma.es.angular.t2a.t2A.PageFeature
import uma.es.angular.t2a.t2A.InstanciaEDOM
import uma.es.angular.t2a.t2A.InstanceEDOMFeature
import org.eclipse.xtext.generator.IFileSystemAccess2
import uma.es.angular.t2a.t2A.StyleClass
import java.util.List
import java.util.ArrayList
import java.util.Set
import java.util.TreeSet
import java.util.HashSet

class AngularPage {
	private static Set<StyleClass> sclasses = new HashSet<StyleClass>();
	private static Set<StyleClass> hostclasses = new HashSet<StyleClass>();

	static def generatePageFiles(Page page, IFileSystemAccess2 fsa) {
		sclasses = new HashSet<StyleClass>();
		hostclasses = new HashSet<StyleClass>();
		var nameLowercase = (new String(page.name)).toLowerCase()
		var relativePath = 'app/pages/' + nameLowercase + '/' + nameLowercase;
		fsa.generateFile(relativePath + '.page.ts', AngularPage.toTSCode(page));
		fsa.generateFile(relativePath + '.page.html', AngularPage.toHTMLCode(page));
		fsa.generateFile(relativePath + '.page.scss', AngularPage.toCSSCode(hostclasses, sclasses));
	}

	static def toTSCode(Page page) {

		'''
				import { Component } from '@angular/core';
			
				@Component({
					selector: '«page.name»',
					templateUrl: './«page.name.toLowerCase».page.html',
					styleUrls:['«page.name.toLowerCase».page.scss']	
					
				})
				export class «page.name»Page{
					
				}
		'''
	// styleUrls:['«page.name».page.scss']	
	// styles:[]
	}

	static def toHTMLCode(Page page) {
		hostclasses.addAll(page.hostclasses);
		
		'''
			«FOR pageFeature : page.pageFeatures»
				«var pf = pageFeature as PageFeature»
				«IF pf.instanciaEDOM !== null »
					«AngularPage.toHTMLCodeForInstanciaEDOM(pf.instanciaEDOM)»
				«ENDIF»	
				«IF pf.string!==null»
					«pf.string»
				«ENDIF»
			«ENDFOR»
		'''
	}

	static def toHTMLCodeForInstanciaEDOM(InstanciaEDOM instanciaEDOM) {
		sclasses.addAll(instanciaEDOM.sclasses);
		
		''' 
			<«instanciaEDOM.instancia.name» «IF sclasses.length>0 || instanciaEDOM.sclassesOnline.length>0 »  class="«getStyleClassesNames(instanciaEDOM.sclasses)» «getStyleClassesStrings(instanciaEDOM.sclassesOnline)»"«ENDIF»>
				«FOR insfeature : instanciaEDOM.insfeatures»
					«var insf = insfeature as InstanceEDOMFeature»
					«IF insf.instanciaEDOM !== null»
						«toHTMLCodeForInstanciaEDOM(insf.instanciaEDOM)»
					«ENDIF»	
					«IF insf.string!==null»
						«insf.string»
					«ENDIF»
				«ENDFOR»
			</«instanciaEDOM.instancia.name»>
		'''
	}

	private static def getStyleClassesNames(List<StyleClass> sclasses) {
		
		'''«FOR sc:sclasses»«sc.name» «ENDFOR»'''
	}
	
	private static def getStyleClassesStrings(List<String> sclassesString) {
		
		'''«FOR scstring:sclassesString »«scstring» «ENDFOR»'''
	}
	
	private static def toCSSCode(Set<StyleClass>  hostclasses,Set<StyleClass>  sclasses) {
		''' «toHostCSSCode(hostclasses)»
			«FOR sclass : sclasses»
				«var sc = sclass as StyleClass»
				.«sc.name» {
					«FOR attri : sc.sattributes»
						«attri.stname» «attri.value»;
					«ENDFOR»
				}
				«IF sc.sattributesAfter.length>0»
					.«sc.name»::after{
						«FOR aafter : sc.sattributesAfter»
							«aafter.stname» «aafter.value»;
						«ENDFOR»		   				
					}
				«ENDIF»
				«IF sc.sattributesActive.length>0»
					.«sc.name».active{
						«FOR aactive : sc.sattributesActive»
							«aactive.stname» «aactive.value»;
						«ENDFOR»		   				
					}
				«ENDIF»				
			«ENDFOR»
		'''
	}

	private static def toHostCSSCode(Set<StyleClass> hostclasses) {
		'''
		«IF hostclasses.length>0»
		:host {
			«FOR sclass : hostclasses»
				«var sc = sclass as StyleClass»							
				«FOR attri : sc.sattributes»
					«attri.stname» «attri.value»;
				«ENDFOR»
			«ENDFOR»
		}
		«ENDIF»		
		«FOR sclass : hostclasses»
			«var sc = sclass as StyleClass»
			«IF sc.sattributesAfter.length>0»
				:host::after{
					«FOR aafter : sc.sattributesAfter»
						«aafter.stname» «aafter.value»;
					«ENDFOR»		   				
				}
			«ENDIF»
			«IF sc.sattributesActive.length>0»
				:host.active{
					«FOR aactive : sc.sattributesActive»
						«aactive.stname» «aactive.value»;
					«ENDFOR»		   				
				}
			«ENDIF»				
		«ENDFOR»
		'''
	}
}
