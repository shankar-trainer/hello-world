import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactComponent } from './react/react.component';
import { NavBarComponent } from './nav/navbar.component';
import { ProductsModule } from './product/products.module';
import { ProductDetailsComponent } from './product/product-details.component';
import {ProductListComponent} from  './product/product-list.component';


@NgModule({
  declarations: [
    AppComponent,
    ReactComponent,
    NavBarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
