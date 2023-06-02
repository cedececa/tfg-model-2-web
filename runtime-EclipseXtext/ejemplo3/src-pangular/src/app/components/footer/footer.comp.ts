import { Component } from '@angular/core';
import { RouterService } from '../../services/router.service';

	
@Component({
	selector: 'Footer',
	templateUrl: './footer.comp.html',
	styleUrls:['footer.comp.scss']	
})
export class FooterComponent{
	constructor(public routerService:RouterService){}	
}
