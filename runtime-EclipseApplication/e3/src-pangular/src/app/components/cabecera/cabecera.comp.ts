import { Component } from '@angular/core';
import { RouterService } from '../../services/router.service';

	
@Component({
	selector: 'Cabecera',
	templateUrl: './cabecera.comp.html',
	styleUrls:['cabecera.comp.scss']	
})
export class CabeceraComponent{
	constructor(public routerService:RouterService){}	
}
