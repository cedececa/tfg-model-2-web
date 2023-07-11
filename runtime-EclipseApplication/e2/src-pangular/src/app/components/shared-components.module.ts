import { NgModule } from '@angular/core';
import { LayoutComponent } from './layout/layout.comp';
		   import { BrowserModule } from '@angular/platform-browser';
		
		
		@NgModule({
		   declarations: [
LayoutComponent,
		   ],
			  exports:[
LayoutComponent,
			  ],
			  imports: [
			    BrowserModule,
			  ]
			})
			export class SharedComponentsModule { }
