import { Routes } from '@angular/router';
import { UserComponent } from './user/user.component';
import { EmployeeComponent } from './employee/employee.component';
import { PersonComponent } from './person/person.component';
import { PipeExampleComponent } from './pipe-example/pipe-example.component';
import { BookComponent } from './book/book.component';
import { CustomerComponent } from './customer/customer.component';

export const routes: Routes = [
    {path:'',component:UserComponent},
    {path:'employee',component:EmployeeComponent},
    {path:'person',component:PersonComponent},
    {path:'pipe',component:PipeExampleComponent},
    {path:'customer',component:CustomerComponent},
    {path:'book',component:BookComponent},
    {path:'user',component:UserComponent}
];
