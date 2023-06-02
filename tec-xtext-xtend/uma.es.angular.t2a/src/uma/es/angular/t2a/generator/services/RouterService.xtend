package uma.es.angular.t2a.generator.services

import org.eclipse.xtext.generator.IFileSystemAccess2

class RouterService {
	static def generate(IFileSystemAccess2 fsa) {
		var relativePath = 'app/services/';
		var fileName = 'router.service.ts';
		fsa.generateFile(relativePath + fileName, RouterService.toTSCode());
	}

	static def toTSCode() {

		'''
		import { Router } from '@angular/router';
		import { Injectable } from '@angular/core';
		
		@Injectable({
		  providedIn: 'root',
		})
		export class RouterService{
			
		  constructor(private router: Router) {}
		  
		  goTo(pageName: String) {
		    const result = this.router.config.filter((r) => {
		      const name1 = r.component?.name;
		      return name1 == pageName;
		    });
		
		    if (result.length > 0) {
      		  this.router.navigateByUrl(result[0].path? result[0].path: '');
		    } else {
		      console.log('no found: ' + pageName);
		    }
		  }
		  
		}
		'''

	}
}
