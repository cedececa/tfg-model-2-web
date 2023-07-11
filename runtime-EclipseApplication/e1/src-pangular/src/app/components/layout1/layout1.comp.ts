import { Component } from '@angular/core';
import { RouterService } from '../../services/router.service';

	
@Component({
	selector: 'Layout1',
	templateUrl: './layout1.comp.html',
	styleUrls:['layout1.comp.scss']	
})
export class Layout1Component{
	constructor(public routerService:RouterService){}	
}
