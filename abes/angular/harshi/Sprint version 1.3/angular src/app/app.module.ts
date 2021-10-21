import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from'@angular/router';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';
import { MytestComponent } from './mytest/mytest.component';
import { CreateTestComponent } from './create-test/create-test.component';
import { UpdateTestComponent } from './update-test/update-test.component';
import { TestDetailsComponent } from './test-details/test-details.component';

@NgModule({
  declarations: [
    AppComponent,
    MytestComponent,
    CreateTestComponent,
    UpdateTestComponent,
    TestDetailsComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
