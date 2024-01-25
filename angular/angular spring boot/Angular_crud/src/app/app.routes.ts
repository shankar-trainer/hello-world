import { Routes } from '@angular/router';
import { ShowallcustomerComponent } from './showallcustomer/showallcustomer.component';
import { CustomeraddComponent } from './customeradd/customeradd.component';
import { CustomersearchComponent } from './customersearch/customersearch.component';

export const routes: Routes = [
    {path:'',component:CustomeraddComponent},
    {path:'add',component:CustomeraddComponent},
    {path:'showall',component:ShowallcustomerComponent},
    {path:'search',component:CustomersearchComponent},
];
