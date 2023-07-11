import { Component } from '@angular/core';
import { RouterService } from '../../services/router.service';

	
@Component({
	selector: 'leftNav',
	templateUrl: './leftnav.comp.html',
	styleUrls:['leftnav.comp.scss']	
})
export class leftNavComponent{
	constructor(public routerService:RouterService){}	
}
