import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import {HttpClientModule} from '@angular/common/http';
import { FormsModule} from '@angular/forms';
import { AdminComponent } from './admin/admin.component';
import { AddAdminComponent } from './add-admin/add-admin.component';
import { CustomerComponent } from './customer/customer.component';
import { AdminDetailsComponent } from './admin-details/admin-details.component';
import { UpdateAdminComponent } from './update-admin/update-admin.component';
import { HomeLoginComponent } from './home-login/home-login.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { CustomerDetailsComponent } from './customer-details/customer-details.component';
import { UpdateCustomerComponent } from './update-customer/update-customer.component';

import { MytestComponent } from './mytest/mytest.component';
import { MydiagnosticcentreComponent } from './mydiagnosticcentre/mydiagnosticcentre.component';
import { CreateTestComponent } from './create-test/create-test.component';
import { CreateDiagnosticcentreComponent } from './create-diagnosticcentre/create-diagnosticcentre.component';
import { MyappointmentComponent } from './myappointment/myappointment.component';
import { CreateAppointmentComponent } from './create-appointment/create-appointment.component';
import { UpdateTestComponent } from './update-test/update-test.component';
import { UpdateAppointmentComponent } from './update-appointment/update-appointment.component';
import { UpdateDiagnosticcentreComponent } from './update-diagnosticcentre/update-diagnosticcentre.component';
import { LogoutComponent } from './logout/logout.component';
import { ListOfTestsComponent } from './list-of-tests/list-of-tests.component';
import { ListOfDiagnosticCentersComponent } from './list-of-diagnostic-centers/list-of-diagnostic-centers.component';



@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    AddAdminComponent,
    CustomerComponent,
    AdminDetailsComponent,
    UpdateAdminComponent,
    HomeLoginComponent,
    AddCustomerComponent,
    CustomerDetailsComponent,
    UpdateCustomerComponent,
	MytestComponent,
    MydiagnosticcentreComponent,
    CreateTestComponent,
    CreateDiagnosticcentreComponent,
    MyappointmentComponent,
    CreateAppointmentComponent,
    UpdateTestComponent,
    UpdateAppointmentComponent,
    UpdateDiagnosticcentreComponent,
    LogoutComponent,
    ListOfTestsComponent,
    ListOfDiagnosticCentersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule, 
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
