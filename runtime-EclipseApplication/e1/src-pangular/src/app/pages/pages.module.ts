import { NgModule } from '@angular/core';
import { HomePage } from './home/home.page';
import { SegundaPage } from './segunda/segunda.page';
import { TerceraPage } from './tercera/tercera.page';
import { CuartaPage } from './cuarta/cuarta.page';
import { BrowserModule } from '@angular/platform-browser';
import { SharedComponentsModule } from '../components/shared-components.module';
import { RouterModule } from '@angular/router';
import { AppRoot } from './app-root';


@NgModule({
declarations: [
	AppRoot,
   HomePage,
   SegundaPage,
   TerceraPage,
   CuartaPage,
],
exports:[
	AppRoot,
HomePage,
SegundaPage,
TerceraPage,
CuartaPage,
],
imports: [
 		    BrowserModule,
 		    SharedComponentsModule,
    		RouterModule.forRoot([
{ path: '', component: HomePage },
{ path: 'segunda', component: SegundaPage },
{ path: 'tercera', component: TerceraPage },
{ path: 'cuarta', component: CuartaPage },
    		])
]
})
export class PagesModule { }
