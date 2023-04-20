package uma.es.angular.t2a.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import java.util.List
import uma.es.angular.t2a.t2A.Page

class PageModule {
	def static generarModule(IFileSystemAccess2 fsa, List<Page> pages) {
		var relativePath = 'pages/';
		fsa.generateFile(relativePath + 'pages.module.ts', PageModule.toModuleCode(pages));
	}

	def static toModuleCode(List<Page> pages) {
		'''import { NgModule } from '@angular/core';
			«FOR page : pages»
				«var nameLowercase = (new String(page.name)).toLowerCase()»
			import { «page.name»Page } from './«nameLowercase»/«nameLowercase».page';
				«ENDFOR»		
			import { BrowserModule } from '@angular/platform-browser';
			import { SharedComponentsModule } from '../components/shared-components.module';
			
			
			@NgModule({
			declarations: [
		    «FOR page : pages»
		    	«page.name»Page,
	    	«ENDFOR»
			],
			exports:[
		    «FOR page : pages»
		    	«page.name»Page,
			«ENDFOR»
			],
			imports: [
	   		    BrowserModule,
	   		    SharedComponentsModule
			]
			})
			export class PagesModule { }
		'''
	}
}
