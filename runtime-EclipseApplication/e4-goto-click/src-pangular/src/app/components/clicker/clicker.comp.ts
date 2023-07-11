import { Component } from '@angular/core';
import { RouterService } from '../../services/router.service';

	
@Component({
	selector: 'Clicker',
	templateUrl: './clicker.comp.html',
	styleUrls:['clicker.comp.scss']	
})
export class ClickerComponent{
	constructor(public routerService:RouterService){}	
}
