import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
//import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { SignUpComponent } from './sign-up/sign-up.component';
import { HttpClientModule } from '@angular/common/http';
import { SuccessComponent } from './success/success.component';


import {ListUserComponent} from './list-user/list-user.component';
import {UpdateComponent} from './update/update.component';
@NgModule({
  declarations: [
    AppComponent,
    
    SignUpComponent,
    SuccessComponent,
    ListUserComponent,
    UpdateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,
    HttpClientModule,
        ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
