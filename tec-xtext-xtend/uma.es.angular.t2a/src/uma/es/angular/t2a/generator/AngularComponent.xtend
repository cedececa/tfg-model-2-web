package uma.es.angular.t2a.generator

import uma.es.angular.t2a.t2A.Comp
import uma.es.angular.t2a.t2A.Feature
import uma.es.angular.t2a.t2A.InstanciaEDOM
import uma.es.angular.t2a.t2A.InstanceEDOMFeature
import org.eclipse.xtext.generator.IFileSystemAccess2

class AngularComponent {

	static def generateComponentFiles(Comp comp, IFileSystemAccess2 fsa) {
		var nameLowercase = (new String(comp.name)).toLowerCase()
		var relativePath = 'components/' + nameLowercase + '/' + nameLowercase;
		fsa.generateFile(relativePath + '.comp.ts', AngularComponent.toTSCode(comp));
		fsa.generateFile(relativePath + '.comp.html', AngularComponent.toHTMLCode(comp));
	}

	static def toTSCode(Comp comp) {
		'''
				import { Component } from '@angular/core';
			
				@Component({
					selector: '«comp.name»',
					templateUrl: './«comp.name.toLowerCase».comp.html',
					styles:[]
				})
				export class «comp.name»Component{
					
				}
		'''

	// styleUrls:['«comp.name».comp.scss']	
	}

	static def toHTMLCode(Comp comp) {
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
		''' 
			<«instanciaEDOM.instancia.name»>
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
}
