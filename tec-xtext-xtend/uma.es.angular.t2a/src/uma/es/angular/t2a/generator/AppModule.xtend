package uma.es.angular.t2a.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import uma.es.angular.t2a.t2A.Page

class AppModule {
	
	def static generarModule(IFileSystemAccess2 fsa, Page page){
		fsa.generateFile('app.module.ts', AppModule.toModuleCode(page));
	}
	def static toModuleCode(uma.es.angular.t2a.t2A.Page page){
		'''
		import { NgModule } from '@angular/core';
		import { PagesModule } from './pages/pages.module';
		import { AppRoot } from './pages/app-root';

		@NgModule({
		  imports: [
		    PagesModule,
		  ],
		  providers: [],
		  bootstrap: [AppRoot]
		})
		export class AppModule { }

		'''
	}
	
}