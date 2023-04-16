import { NgModule } from '@angular/core';
import { CabeceraComponent } from './Cabecera/cabecera.comp';
import { FooterComponent } from './Footer/footer.comp';
import { LayoutComponent } from './Layout/layout.comp';
import { HomeContentComponent } from './HomeContent/homecontent.comp';
import { MenuComponent } from './Menu/menu.comp';
		
		
		@NgModule({
		   declarations: [
CabeceraComponent,
FooterComponent,
LayoutComponent,
HomeContentComponent,
MenuComponent,
		   ],
			  exports:[
CabeceraComponent,
FooterComponent,
LayoutComponent,
HomeContentComponent,
MenuComponent,
			  ]
			  imports: [
			    BrowserModule,
			  ]
			})
			export class SharedComponentsModule { }
