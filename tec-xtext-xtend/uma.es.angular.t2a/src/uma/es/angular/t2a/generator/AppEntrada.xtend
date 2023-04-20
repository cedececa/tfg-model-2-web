package uma.es.angular.t2a.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import uma.es.angular.t2a.t2A.Page

class AppEntrada {
	
	def static generarModule(IFileSystemAccess2 fsa, Page page){
		fsa.generateFile('app.module.ts', AppEntrada.toModuleCode(page));
	}
	def static toModuleCode(uma.es.angular.t2a.t2A.Page page){
		'''
		«var lc=(new String(page.name)).toLowerCase()»
		import { NgModule } from '@angular/core';
		import { PagesModule } from './pages/pages.module';
		import { «page.name»Page } from './pages/«lc»/«lc».page';

		@NgModule({
		  imports: [
		    PagesModule,
		  ],
		  providers: [],
		  bootstrap: [«page.name»Page]
		})
		export class AppModule { }

		'''
	}
	
}