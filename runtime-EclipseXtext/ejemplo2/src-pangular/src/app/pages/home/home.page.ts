	import { Component } from '@angular/core';
	import { RouterService } from '../../services/router.service';

	@Component({
		selector: 'Home',
		templateUrl: './home.page.html',
		styleUrls:['home.page.scss']	
		
	})
	export class HomePage{
		constructor(public routerService:RouterService){}	
	}
