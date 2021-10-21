import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';

import { ProductsComponent } from './products.component';
import { ProductDetailsComponent } from './product-details.component';
import { ProductListComponent } from './product-list.component';

@NgModule({
  imports: [
    CommonModule,
    FormsModule
  ],
  declarations: [
    ProductsComponent,
    ProductDetailsComponent,
    ProductListComponent
  ],
  exports: [
    ProductsComponent
  ]
})
export class ProductsModule {}
