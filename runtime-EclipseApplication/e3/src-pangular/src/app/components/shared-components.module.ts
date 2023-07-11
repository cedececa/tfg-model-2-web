import { NgModule } from '@angular/core';
import { leftNavComponent } from './leftnav/leftnav.comp';
import { CabeceraComponent } from './cabecera/cabecera.comp';
import { SectionComponent } from './section/section.comp';
import { ArticuloComponent } from './articulo/articulo.comp';
import { FooterComponent } from './footer/footer.comp';
import { LayoutComponent } from './layout/layout.comp';
		   import { BrowserModule } from '@angular/platform-browser';
		
		
		@NgModule({
		   declarations: [
leftNavComponent,
CabeceraComponent,
SectionComponent,
ArticuloComponent,
FooterComponent,
LayoutComponent,
		   ],
			  exports:[
leftNavComponent,
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
