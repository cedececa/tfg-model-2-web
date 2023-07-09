package uma.es.angular.t2a.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import java.util.List
import uma.es.angular.t2a.t2A.Page

class PageModule {
	def static generarModule(IFileSystemAccess2 fsa, List<Page> pages) {
		var relativePath = 'app/pages/';
		if (pages.length > 0) {
			fsa.generateFile(relativePath + 'pages.module.ts', PageModule.toModuleCode(pages));
		}
	}

	def static toModuleCode(List<Page> pages) {
		'''
		import { NgModule } from '@angular/core';
		«FOR page : pages»
		«var nameLowercase = (new String(page.name)).toLowerCase()»
		import { «page.name»Page } from './«nameLowercase»/«nameLowercase».page';
		«ENDFOR»		
		import { BrowserModule } from '@angular/platform-browser';
		import { SharedComponentsModule } from '../components/shared-components.module';
		import { RouterModule } from '@angular/router';
		import { AppRoot } from './app-root';
		
		
		@NgModule({
		declarations: [
			AppRoot,
		   «FOR page : pages»
		   «page.name»Page,
		   «ENDFOR»
		],
		exports:[
			AppRoot,
		    «FOR page : pages»
		   	«page.name»Page,
			«ENDFOR»
		],
		imports: [
		BrowserModule,
		SharedComponentsModule,
		RouterModule.forRoot([
		   «FOR page : pages»
		   		« val lowercase= page.name.toLowerCase »
			   «IF page.home»
			   { path: '', component: «page.name»Page },
			   «ELSE»
			   { path: '«lowercase»', component: «page.name»Page },
			   «ENDIF»
		   «ENDFOR»
		])
		]
		})
		export class PagesModule { }
		'''
	}
	
}
