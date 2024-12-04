import { Routes } from '@angular/router';
import { CalculatorComponent } from './calculator/calculator.component';
import { EmployeeComponent } from './employee/employee.component';
import { ReactiveformComponent } from './reactiveform/reactiveform.component';
import { TemplatedrivenComponent } from './templatedriven/templatedriven.component';
import { UserComponent } from './user/user.component';
import {Customer} from './templatedriven/model/customer';
import {CustomerComponent} from './customer/customer.component';
import { CustomerdataComponent } from './customerdata/customerdata.component';
import {Customerdata1Component} from './customerdata1/customerdata1.component';
import {Customer1Component} from './customer1/customer1.component';

export const routes: Routes = [
    {path:'',component:CalculatorComponent},
    {path:'calculator',component:CalculatorComponent},
    {path:'employee',component:EmployeeComponent},
    {path:'reactive',component:ReactiveformComponent},
    {path:'template',component:TemplatedrivenComponent},
    {path:'user',component:UserComponent},
    {path:'customer',component:CustomerComponent},
    {path:'customer1',component:Customer1Component},
    {path:'customerdata',component:CustomerdataComponent},
    {path:'customerdata1/:id/:name/:salary/:country',component:Customerdata1Component},
];
