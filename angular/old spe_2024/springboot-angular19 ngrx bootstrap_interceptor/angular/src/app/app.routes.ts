import { Routes } from '@angular/router';
import { Counterapp1Component } from './counterapp1/counterapp1.component';
import { ReactiveFormComponent } from './reactiveform/reactive-form.component';
import { BookComponent } from './child-parent-bookhouse/book/book.component';
import { CrudComponent } from './crud/crud.component';
import { CustomerComponent } from './child-parent-bookhouse/customer/customer.component';
import { AddbookComponent } from './crud/addbook/addbook.component';
import { ShoppingKartComponent } from './shopping-kart/shopping-kart.component';
import { ProductListComponent } from './shopping-kart/product-list.component';

export const routes: Routes = [
   {path:'', component:Counterapp1Component},
   {path:'counter', component:Counterapp1Component},
   {path:'reactiveform', component:ReactiveFormComponent},
   {path:'book', component:BookComponent},
   {path:'crud-allbook', component:CrudComponent},
   {path:'crud-addbook', component:AddbookComponent},
   {path:'customer', component:CustomerComponent},
   {path:'shoppingkart', component:ShoppingKartComponent},
   {path:'productlist', component:ProductListComponent},

];
