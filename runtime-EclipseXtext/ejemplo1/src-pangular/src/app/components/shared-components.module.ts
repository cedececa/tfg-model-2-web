import { NgModule } from '@angular/core';
import { Layout1Component } from './layout1/layout1.comp';
import { CabeceraComponent } from './cabecera/cabecera.comp';
		   import { BrowserModule } from '@angular/platform-browser';
		
		
		@NgModule({
		   declarations: [
Layout1Component,
CabeceraComponent,
		   ],
			  exports:[
Layout1Component,
CabeceraComponent,
			  ],
			  imports: [
			    BrowserModule,
			  ]
			})
			export class SharedComponentsModule { }
