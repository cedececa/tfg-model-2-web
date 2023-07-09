import { NgModule } from '@angular/core';
import { PagesModule } from './pages/pages.module';
import { AppRoot } from './pages/app-root';

@NgModule({
  imports: [
    PagesModule,
  ],
  providers: [],
  bootstrap: [AppRoot]
})
export class AppModule { }

