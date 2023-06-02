	import { Component } from '@angular/core';
	import { RouterService } from '../../services/router.service';

	@Component({
		selector: 'Primera',
		templateUrl: './primera.page.html',
		styleUrls:['primera.page.scss']	
		
	})
	export class PrimeraPage{
		constructor(public routerService:RouterService){}	
	}
