package uma.es.angular.t2a.generator

import org.eclipse.xtext.generator.IFileSystemAccess2

class AppEntrada {
	
	def static generarSharedModule(IFileSystemAccess2 fsa, uma.es.angular.t2a.t2A.Page page){
		fsa.generateFile('app.module.ts', AppEntrada.toModuleCode(page));
	}
	def static toModuleCode(uma.es.angular.t2a.t2A.Page page){
		'''
		import { NgModule } from '@angular/core';
		import { BrowserModule } from '@angular/platform-browser';
		import { SharedComponentsModule } from './components/sharedcomponent.module';

		@NgModule({
		  imports: [
		    BrowserModule,
		    SharedComponentsModule,
		  ],
		  providers: [],
		  bootstrap: [«page.name»Page]
		})
		export class AppModule { }

		'''
	}
	
}