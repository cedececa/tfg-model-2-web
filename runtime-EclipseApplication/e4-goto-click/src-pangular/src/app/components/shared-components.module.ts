import { NgModule } from '@angular/core';
import { ClickerComponent } from './clicker/clicker.comp';
import { Layout1Component } from './layout1/layout1.comp';
import { CabeceraComponent } from './cabecera/cabecera.comp';
		   import { BrowserModule } from '@angular/platform-browser';
		
		
		@NgModule({
		   declarations: [
ClickerComponent,
Layout1Component,
CabeceraComponent,
		   ],
			  exports:[
ClickerComponent,
Layout1Component,
CabeceraComponent,
			  ],
			  imports: [
			    BrowserModule,
			  ]
			})
			export class SharedComponentsModule { }
