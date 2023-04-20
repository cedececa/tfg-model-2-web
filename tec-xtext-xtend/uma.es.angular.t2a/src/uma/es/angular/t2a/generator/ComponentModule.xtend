package uma.es.angular.t2a.generator
import java.util.List
import uma.es.angular.t2a.t2A.Comp
import org.eclipse.xtext.generator.IFileSystemAccess2

class ComponentModule {
//	public static List<Comp> components = new ArrayList<Comp>();

	def static generarModule(IFileSystemAccess2 fsa, List<Comp> components){
		var relativePath = 'components/';
		if(components.length>0){
			fsa.generateFile(relativePath + 'shared-components.module.ts', ComponentModule.toModuleCode(components));
		}
	}
	def static toModuleCode(List<Comp> components){
		'''import { NgModule } from '@angular/core';
		    «FOR component : components»
				«var nameLowercase = (new String(component.name)).toLowerCase()»
				import { «component.name»Component } from './«nameLowercase»/«nameLowercase».comp';
		    «ENDFOR»		
		   import { BrowserModule } from '@angular/platform-browser';
		
		
		@NgModule({
		   declarations: [
			 «FOR component : components»
		     	«component.name»Component,
	         «ENDFOR»
		   ],
			  exports:[
			  	 «FOR component : components»
					«component.name»Component,
	 		     «ENDFOR»
			  ],
			  imports: [
			    BrowserModule,
			  ]
			})
			export class SharedComponentsModule { }
		'''
	}
	
}