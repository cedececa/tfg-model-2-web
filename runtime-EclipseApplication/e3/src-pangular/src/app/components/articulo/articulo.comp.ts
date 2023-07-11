import { Component } from '@angular/core';
import { RouterService } from '../../services/router.service';

	
@Component({
	selector: 'Articulo',
	templateUrl: './articulo.comp.html',
	styleUrls:['articulo.comp.scss']	
})
export class ArticuloComponent{
	constructor(public routerService:RouterService){}	
}
