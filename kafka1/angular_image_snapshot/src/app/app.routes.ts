import { Routes } from '@angular/router';
import { CustomerComponent } from './customer/customer.component';
import { ProductComponent } from './product/product.component';
import { ProductComponent1 } from './product1/product1.component';
import { SearchproductComponent } from './searchproduct/searchproduct.component';
import { SearchproductComponent1 } from './searchproduct1/searchproduct1.component';
import { Searchproduct2Component } from './searchproduct2/searchproduct2.component';

export const routes: Routes = [
  { path: '', component: CustomerComponent },
  { path: 'customer', component: CustomerComponent },
  { path: 'product', component: ProductComponent },
  { path: 'searchproduct/:id/:name/:cost', component: SearchproductComponent },
  { path: 'product1', component: ProductComponent1 },
  { path: 'searchproduct1/:id/:name/:cost', component: SearchproductComponent1 },
  { path: 'searchproduct2/:id', component: Searchproduct2Component },
];

