import { NgModule } from '@angular/core';
import { CabeceraComponent } from './cabecera/cabecera.comp';
import { SectionComponent } from './section/section.comp';
import { ArticuloComponent } from './articulo/articulo.comp';
import { FooterComponent } from './footer/footer.comp';
import { LayoutComponent } from './layout/layout.comp';
		   import { BrowserModule } from '@angular/platform-browser';
		
		
		@NgModule({
		   declarations: [
CabeceraComponent,
SectionComponent,
ArticuloComponent,
FooterComponent,
LayoutComponent,
		   ],
			  exports:[
CabeceraComponent,
SectionComponent,
ArticuloComponent,
FooterComponent,
LayoutComponent,
			  ],
			  imports: [
			    BrowserModule,
			  ]
			})
			export class SharedComponentsModule { }
