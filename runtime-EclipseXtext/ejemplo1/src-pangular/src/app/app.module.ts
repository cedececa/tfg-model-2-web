import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { SharedComponentsModule } from './components/sharedcomponent.module';

@NgModule({
  imports: [
    BrowserModule,
    SharedComponentsModule,
  ],
  providers: [],
  bootstrap: [HomePage]
})
export class AppModule { }

