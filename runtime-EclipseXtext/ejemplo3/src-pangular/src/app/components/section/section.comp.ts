import { Component } from '@angular/core';
import { RouterService } from '../../services/router.service';

	
@Component({
	selector: 'Section',
	templateUrl: './section.comp.html',
	styleUrls:['section.comp.scss']	
})
export class SectionComponent{
	constructor(public routerService:RouterService){}	
}
