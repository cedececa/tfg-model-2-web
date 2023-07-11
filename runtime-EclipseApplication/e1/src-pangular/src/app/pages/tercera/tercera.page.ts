	import { Component } from '@angular/core';
	import { RouterService } from '../../services/router.service';

	@Component({
		selector: 'Tercera',
		templateUrl: './tercera.page.html',
		styleUrls:['tercera.page.scss']	
		
	})
	export class TerceraPage{
		constructor(public routerService:RouterService){}	
	}
