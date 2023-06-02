import { Component } from '@angular/core';
import { RouterService } from '../../services/router.service';

	
@Component({
	selector: 'Layout',
	templateUrl: './layout.comp.html',
	styleUrls:['layout.comp.scss']	
})
export class LayoutComponent{
	constructor(public routerService:RouterService){}	
}
