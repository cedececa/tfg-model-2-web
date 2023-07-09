import { NgModule } from '@angular/core';
import { HomePage } from './home/home.page';
import { SegundaPage } from './segunda/segunda.page';
import { TerceraPage } from './tercera/tercera.page';
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
],
exports:[
	AppRoot,
HomePage,
SegundaPage,
TerceraPage,
],
imports: [
BrowserModule,
SharedComponentsModule,
RouterModule.forRoot([
{ path: '', component: HomePage },
{ path: 'segunda', component: SegundaPage },
{ path: 'tercera', component: TerceraPage },
])
]
})
export class PagesModule { }
