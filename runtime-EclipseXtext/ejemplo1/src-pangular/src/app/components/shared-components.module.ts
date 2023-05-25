import { NgModule } from '@angular/core';
import { Layout1Component } from './layout1/layout1.comp';
		   import { BrowserModule } from '@angular/platform-browser';
		
		
		@NgModule({
		   declarations: [
Layout1Component,
		   ],
			  exports:[
Layout1Component,
			  ],
			  imports: [
			    BrowserModule,
			  ]
			})
			export class SharedComponentsModule { }
