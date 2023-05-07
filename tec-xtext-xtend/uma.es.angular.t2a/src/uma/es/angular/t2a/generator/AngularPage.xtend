package uma.es.angular.t2a.generator

import uma.es.angular.t2a.t2A.Page
import uma.es.angular.t2a.t2A.PageFeature
import uma.es.angular.t2a.t2A.InstanciaEDOM
import uma.es.angular.t2a.t2A.InstanceEDOMFeature
import org.eclipse.xtext.generator.IFileSystemAccess2
import uma.es.angular.t2a.t2A.StyleClass

class AngularPage {

	static def generatePageFiles(Page page, IFileSystemAccess2 fsa) {
		var nameLowercase = (new String(page.name)).toLowerCase()
		var relativePath = 'pages/' + nameLowercase + '/' + nameLowercase;
		fsa.generateFile(relativePath + '.page.ts', AngularPage.toTSCode(page));
		fsa.generateFile(relativePath + '.page.html', AngularPage.toHTMLCode(page));
		fsa.generateFile(relativePath + '.page.scss', AngularPage.toCSSCode(page));
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

	static def toCSSCode(Page page) {
		'''
			«FOR sclass : page.sclasses»
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
}
