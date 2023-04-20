import { NgModule } from '@angular/core';
import { CabeceraComponent } from './cabecera/cabecera.comp';
import { FooterComponent } from './footer/footer.comp';
import { LayoutComponent } from './layout/layout.comp';
import { HomeContentComponent } from './homecontent/homecontent.comp';
import { MenuComponent } from './menu/menu.comp';
import { BrowserModule } from '@angular/platform-browser';


@NgModule({
	declarations: [
		CabeceraComponent,
		FooterComponent,
		LayoutComponent,
		HomeContentComponent,
		MenuComponent,
	],
	exports: [
		CabeceraComponent,
		FooterComponent,
		LayoutComponent,
		HomeContentComponent,
		MenuComponent,
	],
	imports: [
		BrowserModule,
	]
})
export class SharedComponentsModule { }
