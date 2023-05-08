package uma.es.angular.t2a.generator

import uma.es.angular.t2a.t2A.StyleGlobal
import uma.es.angular.t2a.t2A.StyleClass
import org.eclipse.xtext.generator.IFileSystemAccess2

class StyleGlobalCSS {
	
	static def toStyleGlobalFile(StyleGlobal sg, IFileSystemAccess2 fsa){
		var relativePath = ''; // in directory src
		fsa.generateFile(relativePath + 'styles.scss', toStyleGlobalContent(sg));
	}
	private static def toStyleGlobalContent(StyleGlobal sg){
		'''
		/* You can add global styles to this file, and also import other style files */
			
		«FOR sclass : sg.styleclasses»
			«var sc = sclass as StyleClass»
			«sc.name» {
				«FOR attri : sc.sattributes»
					«attri.stname» «attri.value»;
				«ENDFOR»
			}
			«IF sc.sattributesAfter.length>0»
				«sc.name»::after{
					«FOR aafter : sc.sattributesAfter»
						«aafter.stname» «aafter.value»;
					«ENDFOR»		   				
				}
			«ENDIF»
			«IF sc.sattributesActive.length>0»
				«sc.name».active{
					«FOR aactive : sc.sattributesActive»
						«aactive.stname» «aactive.value»;
					«ENDFOR»		   				
				}
			«ENDIF»				
		«ENDFOR»
		'''
	}
}