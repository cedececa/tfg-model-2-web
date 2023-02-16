import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { CabeceraComponent } from './cabecera/cabecera.component';
import { FooterComponent } from './footer/footer.component';
import { LayoutComponent } from './layout/layout.component';
import { HomeContentComponent } from './home-content/home-content.component';

@NgModule({
  declarations: [
    AppComponent,
    CabeceraComponent,
    FooterComponent,
    LayoutComponent,
    HomeContentComponent
  ],
  imports: [
    BrowserModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
