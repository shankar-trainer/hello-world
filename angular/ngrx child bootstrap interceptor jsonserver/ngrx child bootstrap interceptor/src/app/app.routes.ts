import { Routes } from '@angular/router';
import { Counterapp1Component } from './counterapp1/counterapp1.component';
import { ReactiveFormComponent } from './reactiveform/reactive-form.component';
import { BookComponent } from './child-parent-bookhouse/book/book.component';
import { CrudComponent } from './crud/crud.component';
import { CustomerComponent } from './child-parent-bookhouse/customer/customer.component';
import { AddbookComponent } from './crud/addbook/addbook.component';
import {TwowayComponent} from "./twoway/twoway.component";
import {ParentComponent1} from "./viewchild1/parent/parent.component";
import {ParentComponent} from "./viewchild/parent/parent.component";

export const routes: Routes = [
   {path:'', component:Counterapp1Component},
   {path:'counter', component:Counterapp1Component},
   {path:'reactiveform', component:ReactiveFormComponent},
   {path:'book', component:BookComponent},
   {path:'crud-allbook', component:CrudComponent},
   {path:'crud-addbook', component:AddbookComponent},
   {path:'customer', component:CustomerComponent},
   {path:'twoway', component:TwowayComponent},
   {path:'viewchild', component:ParentComponent},
   {path:'viewchild1', component:ParentComponent1},

];
