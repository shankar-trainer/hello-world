import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeComponent } from './employee/employee.component';
import { BookComponent } from './book/book.component';
import { CustomerComponent } from './customer/customer.component';
import { PersonComponent } from './person/person.component';
import { ProductComponent } from './product/product.component';
import { UserComponent } from './user/user.component';
import { MyproductComponent } from './myproduct/myproduct.component';
import { SearchproductComponent } from './searchproduct/searchproduct.component';

const routes: Routes = [
{path:'employee',component:EmployeeComponent},
{path:'book',component:BookComponent},
{path:'customer',component:CustomerComponent},
{path:'product',component:ProductComponent},
{path:'user',component:UserComponent},
{path:'person',component:PersonComponent},
{path:'product1',component:MyproductComponent},
{path:'searchprd',component:SearchproductComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
