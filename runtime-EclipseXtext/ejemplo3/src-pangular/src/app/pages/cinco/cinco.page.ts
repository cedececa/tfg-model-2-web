	import { Component } from '@angular/core';
	import { RouterService } from '../../services/router.service';

	@Component({
		selector: 'Cinco',
		templateUrl: './cinco.page.html',
		styleUrls:['cinco.page.scss']	
		
	})
	export class CincoPage{
		constructor(public routerService:RouterService){}	
	}
