import { Routes } from '@angular/router';
import { CalculatorComponent } from './calculator/calculator.component';
import { ConsumerComponent } from './consumer/consumer.component';
import { CustomerComponent } from './customer/customer.component';
import { EmployeeComponent } from './employee/employee.component';
import { PipeExampleComponent } from './pipe-example/pipe-example.component';
import { ProductComponent } from './product/product.component';
import { UserComponent } from './user/user.component';

export const routes: Routes = [
 {path:'',component:CalculatorComponent},
 {path:'calculator',component:CalculatorComponent},
 {path:'consumer',component:ConsumerComponent},
 {path:'customer',component:CustomerComponent},
 {path:'employee',component:EmployeeComponent},
 {path:'pipe',component:PipeExampleComponent},
 {path:'product',component:ProductComponent},
 {path:'user',component:UserComponent},
];
