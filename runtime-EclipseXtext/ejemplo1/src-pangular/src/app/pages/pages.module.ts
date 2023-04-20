import { NgModule } from '@angular/core';
import { PrimeraPage } from './primera/primera.page';
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
   PrimeraPage,
   SegundaPage,
   TerceraPage,
   CuartaPage,
],
exports:[
	AppRoot,
PrimeraPage,
SegundaPage,
TerceraPage,
CuartaPage,
],
imports: [
 		    BrowserModule,
 		    SharedComponentsModule,
    		RouterModule.forRoot([
{ path: '', component: PrimeraPage },
{ path: 'segunda', component: SegundaPage },
{ path: 'tercera', component: TerceraPage },
{ path: 'cuarta', component: CuartaPage },
    		])
]
})
export class PagesModule { }
