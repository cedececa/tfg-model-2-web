	import { Component } from '@angular/core';
	import { RouterService } from '../../services/router.service';

	@Component({
		selector: 'Cuarta',
		templateUrl: './cuarta.page.html',
		styleUrls:['cuarta.page.scss']	
		
	})
	export class CuartaPage{
		constructor(public routerService:RouterService){}	
	}
