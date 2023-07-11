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
