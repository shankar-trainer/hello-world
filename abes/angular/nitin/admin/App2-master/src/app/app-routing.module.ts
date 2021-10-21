import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddAdminComponent } from './add-admin/add-admin.component';
import { AdminComponent } from './admin/admin.component';
import { Admin } from './admin';
import { AdminDetailsComponent } from './admin-details/admin-details.component';
import { UpdateAdminComponent } from './update-admin/update-admin.component';
import { HomeLoginComponent } from './home-login/home-login.component';
import { CustomerComponent } from './customer/customer.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { CustomerDetailsComponent } from './customer-details/customer-details.component';


const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: HomeLoginComponent },
  { path: 'update/:id', component: UpdateAdminComponent },
  { path: 'details/:id', component: AdminDetailsComponent },
  { path: 'updateCustomer/:id', component: AddCustomerComponent },
  { path: 'customerDetails/:id', component: CustomerDetailsComponent },
  { path: 'admin', component: AdminComponent },
  { path: 'addAdmin', component: AddAdminComponent },
  { path: 'customer', component: CustomerComponent },
  { path: 'addCustomer', component: AddCustomerComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
