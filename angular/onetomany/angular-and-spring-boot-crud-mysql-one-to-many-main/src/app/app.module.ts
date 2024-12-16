import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeListComponent } from './components/employee-list/employee-list.component';
import { AddressListComponent } from './components/address-list/address-list.component';
import { BothListComponent } from './components/both-list/both-list.component';
import {HttpClientModule} from "@angular/common/http";
import { EmployeeFormCreateComponent } from './components/employee-form-create/employee-form-create.component';
import {FormsModule} from "@angular/forms";
import { EmployeeFormEditComponent } from './components/employee-form-edit/employee-form-edit.component';
import { AddressFormCreateComponent } from './components/address-form-create/address-form-create.component';
import { AddressFormEditComponent } from './components/address-form-edit/address-form-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeListComponent,
    AddressListComponent,
    BothListComponent,
    EmployeeFormCreateComponent,
    EmployeeFormEditComponent,
    AddressFormCreateComponent,
    AddressFormEditComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        FormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
