import { NgModule } from '@angular/core';
import { PagesModule } from './pages/pages.module';
import { HomePage } from './pages/home/home.page';

@NgModule({
  imports: [
    PagesModule,
  ],
  providers: [],
  bootstrap: [HomePage]
})
export class AppModule { }

