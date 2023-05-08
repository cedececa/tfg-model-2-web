package uma.es.angular.t2a.generator

import uma.es.angular.t2a.t2A.Comp
import uma.es.angular.t2a.t2A.Feature
import uma.es.angular.t2a.t2A.InstanciaEDOM
import uma.es.angular.t2a.t2A.InstanceEDOMFeature
import org.eclipse.xtext.generator.IFileSystemAccess2
import uma.es.angular.t2a.t2A.StyleClass
import java.util.List
import java.util.ArrayList
import java.util.Set
import java.util.TreeSet
import java.util.HashSet

class AngularComponent {

	private static Set<StyleClass> sclasses = new HashSet<StyleClass>();
	private static Set<StyleClass> hostclasses = new HashSet<StyleClass>();
	
	static def generateComponentFiles(Comp comp, IFileSystemAccess2 fsa) {
		sclasses = new HashSet<StyleClass>();
		hostclasses = new HashSet<StyleClass>();
		
		var nameLowercase = (new String(comp.name)).toLowerCase()
		var relativePath = 'app/components/' + nameLowercase + '/' + nameLowercase;
		fsa.generateFile(relativePath + '.comp.ts', AngularComponent.toTSCode(comp));
		fsa.generateFile(relativePath + '.comp.html', AngularComponent.toHTMLCode(comp));
		fsa.generateFile(relativePath + '.comp.scss', AngularComponent.toCSSCode(hostclasses,sclasses));
	}

	static def toTSCode(Comp comp) {
		'''
				import { Component } from '@angular/core';
			
				@Component({
					selector: '«comp.name»',
					templateUrl: './«comp.name.toLowerCase».comp.html',
					styleUrls:['«comp.name.toLowerCase».comp.scss']	
				})
				export class «comp.name»Component{
					
				}
		'''

	// styleUrls:['«comp.name».comp.scss']	
	}

	static def toHTMLCode(Comp comp) {
		hostclasses.addAll(comp.hostclasses);
		'''
			«FOR feature : comp.features»
				«var f = feature as Feature»
				«IF f.instanciaEDOM !== null »
					«AngularComponent.toHTMLCodeForInstanciaEDOM(f.instanciaEDOM)»
				«ENDIF»	
				«IF f.isAllowSlot»
					<ng-content>
					</ng-content>
				«ENDIF»
				«IF f.string!==null»
					«f.string»
				«ENDIF»
			«ENDFOR»
		'''
	}

	static def toHTMLCodeForInstanciaEDOM(InstanciaEDOM instanciaEDOM) {
		sclasses.addAll(instanciaEDOM.sclasses);
		''' 
			<«instanciaEDOM.instancia.name» «getStyleClassesNames(instanciaEDOM.sclasses)»>
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
		
		'''«IF sclasses.length>0»  class="«FOR sc:sclasses»«sc.name» «ENDFOR»" «ENDIF»'''
	}

	private static def toCSSCode(Set<StyleClass> hostclasses,Set<StyleClass> sclasses) {
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
	private static def toHostCSSCode(Set<StyleClass> hostclasses){
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
