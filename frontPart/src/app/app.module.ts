import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';    //accordion and accordion tab
import { RadarComponent } from './radar/radar.component';                  //api
import {HttpClientModule} from '@angular/common/http';
import {TableModule} from 'primeng/table';
import { NavebareComponent } from './navebare/navebare.component';
import { PrioritaireComponent } from './prioritaire/prioritaire.component';

@NgModule({
  declarations: [
    AppComponent,
    RadarComponent,
    NavebareComponent,
    PrioritaireComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    TableModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
