import { Routes } from '@angular/router';
import { GetallcustomerComponent } from './getallcustomer/getallcustomer.component';
import { AddcustomerComponent } from './addcustomer/addcustomer.component';
import { SearchcustomerComponent } from './searchcustomer/searchcustomer.component';

export const routes: Routes = [
    {path:'',component:GetallcustomerComponent},
    {path:'all customer',component:GetallcustomerComponent},
    {path:'add customer',component:AddcustomerComponent},
    {path:'search byid',component:SearchcustomerComponent},
];
