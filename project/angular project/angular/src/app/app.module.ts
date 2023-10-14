import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { MyproductComponent } from './myproduct/myproduct.component';
import { RouterModule } from '@angular/router';
import {HttpClientModule} from '@angular/common/http';
import { CreateProductComponent } from './create-product/create-product.component';
import { FormsModule} from '@angular/forms';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { UpdateProductComponent } from './update-product/update-product.component';
import { SearchProductComponent } from './search-product/search-product.component';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    MyproductComponent,
    CreateProductComponent,
    ProductDetailsComponent,
    UpdateProductComponent,
    SearchProductComponent
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
