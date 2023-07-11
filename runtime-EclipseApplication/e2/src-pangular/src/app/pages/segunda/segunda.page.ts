	import { Component } from '@angular/core';
	import { RouterService } from '../../services/router.service';

	@Component({
		selector: 'Segunda',
		templateUrl: './segunda.page.html',
		styleUrls:['segunda.page.scss']	
		
	})
	export class SegundaPage{
		constructor(public routerService:RouterService){}	
	}
