import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { SecurityComponent } from './security/security.component';
import { JwtClientService } from './jwt-client.service';
import { UserComponent } from './user/user.component';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { RouterTestingModule } from "@angular/router/testing";
import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    SecurityComponent,
    UserComponent
  ],
  imports: [
    RouterTestingModule,
    BrowserModule,RouterModule,
    AppRoutingModule,
    HttpClientModule,FormsModule
  ],

  // imports: [
  //   BrowserModule,
  //   AppRoutingModule,
  //   FormsModule
  // ],

  // providers: [JwtClientService],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
