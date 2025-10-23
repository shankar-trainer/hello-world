import { Routes } from '@angular/router';
import {CartComponent} from './cart/cart.component';
import {ProductListComponent} from './product-list/product-list.component';

export const routes: Routes = [
  {path:'',component:CartComponent},
  {path:'cart',component:CartComponent},
  {path:'product',component:ProductListComponent},
];
