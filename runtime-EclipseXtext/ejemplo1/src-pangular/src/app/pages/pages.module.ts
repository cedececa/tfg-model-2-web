import { NgModule } from '@angular/core';
import { HomePage } from './home/home.page';
import { ItemsPage } from './items/items.page';
import { BrowserModule } from '@angular/platform-browser';
import { SharedComponentsModule } from '../components/shared-components.module';


@NgModule({
	declarations: [
		HomePage,
		ItemsPage,
	],
	exports: [
		HomePage,
		ItemsPage,
	],
	imports: [
		BrowserModule,
		SharedComponentsModule
	]
})
export class PagesModule { }
