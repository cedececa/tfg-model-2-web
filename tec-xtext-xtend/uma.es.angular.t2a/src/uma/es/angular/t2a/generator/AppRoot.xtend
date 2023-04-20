package uma.es.angular.t2a.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import uma.es.angular.t2a.t2A.Page

class AppRoot {
	
	def static generarRoot(IFileSystemAccess2 fsa){
		fsa.generateFile('./pages/app-root.ts', AppRoot.toRootPageTSCode());
		fsa.generateFile('./pages/app-root.html', AppRoot.toRootPageHTMLCode());
	}
	def static toRootPageTSCode(){
		'''
		
		import { Component } from '@angular/core';
		
		@Component({
		    selector: 'app-root',
		    templateUrl: './app-root.html',
		    styles: []
		
		})
		export class AppRoot {
		
		}

		'''
	}
	def static toRootPageHTMLCode(){
		'''
		
		<!-- The routed views render in the <router-outlet>-->
		<router-outlet></router-outlet>

		'''
	}
}