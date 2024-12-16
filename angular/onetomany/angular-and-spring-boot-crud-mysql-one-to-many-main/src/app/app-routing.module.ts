import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {EmployeeListComponent} from "./components/employee-list/employee-list.component";
import {AddressListComponent} from "./components/address-list/address-list.component";
import {BothListComponent} from "./components/both-list/both-list.component";
import {EmployeeFormCreateComponent} from "./components/employee-form-create/employee-form-create.component";
import {EmployeeFormEditComponent} from "./components/employee-form-edit/employee-form-edit.component";
import {AddressFormCreateComponent} from "./components/address-form-create/address-form-create.component";
import {AddressFormEditComponent} from "./components/address-form-edit/address-form-edit.component";

const routes: Routes = [
  {path:'both/list' , component:BothListComponent},
  {path:'employee/list' , component:EmployeeListComponent},
  {path:'employee/form-create' , component:EmployeeFormCreateComponent},
  {path:'address/form-create' , component:AddressFormCreateComponent},
  {path:'employee/editing/:eid' , component:EmployeeFormEditComponent},
  {path:'address/editing/:aid' , component:AddressFormEditComponent},
  {path:'address/list' , component:AddressListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
