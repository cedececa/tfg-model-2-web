import { NgModule } from '@angular/core';
import { PrimeraPage } from './primera/primera.page';
import { SegundaPage } from './segunda/segunda.page';
import { TerceraPage } from './tercera/tercera.page';
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
],
exports:[
	AppRoot,
PrimeraPage,
SegundaPage,
TerceraPage,
],
imports: [
 		    BrowserModule,
 		    SharedComponentsModule,
    		RouterModule.forRoot([
{ path: '', component: PrimeraPage },
{ path: 'segunda', component: SegundaPage },
{ path: 'tercera', component: TerceraPage },
    		])
]
})
export class PagesModule { }
