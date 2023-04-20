import { NgModule } from '@angular/core';
import { AComponent } from './a/a.comp';
		   import { BrowserModule } from '@angular/platform-browser';
		
		
		@NgModule({
		   declarations: [
AComponent,
		   ],
			  exports:[
AComponent,
			  ],
			  imports: [
			    BrowserModule,
			  ]
			})
			export class SharedComponentsModule { }
