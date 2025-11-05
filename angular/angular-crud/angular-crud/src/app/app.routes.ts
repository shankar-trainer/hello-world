import {Routes} from '@angular/router';
import {Component} from '@angular/core';
import {AllcustomerComponent} from './allcustomer/allcustomer.component';
import {SearchcustomerComponent} from './searchcustomer/searchcustomer.component';
import {DeletecustomerComponent} from './deletecustomer/deletecustomer.component';
import {UpdatecustomerComponent} from './updatecustomer/updatecustomer.component';
import {AddcustomerComponent} from './addcustomer/addcustomer.component';

export const routes: Routes = [
  {path: '', component: AllcustomerComponent},
  {path: 'all', component: AllcustomerComponent},
  {path: 'search', component: SearchcustomerComponent},
  {path: 'delete', component: DeletecustomerComponent},
  {path: 'update', component: UpdatecustomerComponent},
  {path: 'add', component: AddcustomerComponent},

];
