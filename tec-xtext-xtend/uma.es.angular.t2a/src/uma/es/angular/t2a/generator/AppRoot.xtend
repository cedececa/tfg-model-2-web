package uma.es.angular.t2a.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import uma.es.angular.t2a.t2A.Page
import java.util.List
import java.util.ArrayList

class AppRoot {
	
	def static generarRoot(IFileSystemAccess2 fsa, List<Page> pages){
		fsa.generateFile('app/pages/app-root.ts', AppRoot.toRootPageTSCode());
		fsa.generateFile('app/pages/app-root.html', AppRoot.toRootPageHTMLCode(pages));
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
	def static toRootPageHTMLCode(List<Page> pages){
		var showInNavPages = new ArrayList<Page>();
		for(p: pages){
			if(p.showInNav){
				showInNavPages.add(p);
			}
		}
		'''
		«IF showInNavPages.length>0»
		<nav>
		    <ul>
		«FOR page: showInNavPages»
			«IF page.home»
				<li><a routerLink="/" routerLinkActive="active"  [routerLinkActiveOptions]="{exact: true}" ariaCurrentWhenActive="page">Home</a></li>
			«ELSE»
				<li><a routerLink="/«page.name.toLowerCase»" routerLinkActive="active" ariaCurrentWhenActive="page">«page.name»</a></li>
			«ENDIF»
		«ENDFOR»
		    </ul>
		</nav>
		«ENDIF»
		<!-- The routed views render in the <router-outlet>-->
		<router-outlet></router-outlet>

		'''
	}
}