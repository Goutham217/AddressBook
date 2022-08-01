import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { ViewallcontactsComponent } from './contacts/viewallcontacts/viewallcontacts.component';
import { UpdateallcontactsComponent } from './contacts/updateallcontacts/updateallcontacts.component';
import { HttpserviceComponent } from './httpservice/httpservice.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ViewallcontactsComponent,
    UpdateallcontactsComponent,
    HttpserviceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
