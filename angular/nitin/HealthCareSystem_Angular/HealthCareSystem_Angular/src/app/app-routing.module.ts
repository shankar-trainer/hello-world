import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddAdminComponent } from './add-admin/add-admin.component';
import { AdminComponent } from './admin/admin.component';
import { AdminDetailsComponent } from './admin-details/admin-details.component';
import { UpdateAdminComponent } from './update-admin/update-admin.component';
import { HomeLoginComponent } from './home-login/home-login.component';
import { CustomerComponent } from './customer/customer.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { CustomerDetailsComponent } from './customer-details/customer-details.component';
import { UpdateCustomerComponent } from './update-customer/update-customer.component';
import { AuthGuardServiceService } from './service/auth-guard-service.service';

import { MydiagnosticcentreComponent } from './mydiagnosticcentre/mydiagnosticcentre.component';
import { CreateTestComponent } from './create-test/create-test.component';
import { CreateDiagnosticcentreComponent } from './create-diagnosticcentre/create-diagnosticcentre.component';
import { MyappointmentComponent } from './myappointment/myappointment.component';
import { CreateAppointmentComponent } from './create-appointment/create-appointment.component';
import { UpdateTestComponent } from './update-test/update-test.component';
import { UpdateDiagnosticcentreComponent } from './update-diagnosticcentre/update-diagnosticcentre.component';
import { UpdateAppointmentComponent } from './update-appointment/update-appointment.component';
import { MytestComponent } from './mytest/mytest.component';



const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: HomeLoginComponent },
  { path: 'adminUpdate/:id', component: UpdateAdminComponent },
  { path: 'adminDetails/:id', component: AdminDetailsComponent },
  { path: 'updateCustomer/:id', component: UpdateCustomerComponent },
  { path: 'customerDetails/:id', component: CustomerDetailsComponent },
  { path: 'admin', component: AdminComponent, canActivate: [AuthGuardServiceService] },
  { path: 'addAdmin', component: AddAdminComponent },
  { path: 'customer', component: CustomerComponent },
  { path: 'addCustomer', component: AddCustomerComponent },
  { path: 'mytest', component: MytestComponent },
  { path: 'addtest', component: CreateTestComponent },
  { path: 'mydiagnosticCentre', component: MydiagnosticcentreComponent },
  { path: 'adddiagnosticcentre', component: CreateDiagnosticcentreComponent },
  { path: 'myappointment', component: MyappointmentComponent },
  { path: 'addappointment', component: CreateAppointmentComponent },
  { path: 'updateTest/:id', component: UpdateTestComponent },
  { path: 'updateDiagnosticCentre/:id', component: UpdateDiagnosticcentreComponent },
  { path: 'updateAppointment/:id', component: UpdateAppointmentComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
