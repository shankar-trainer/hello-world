import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookComponent } from './book/book.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { Calculator1Component } from './calculator1/calculator1.component';
import { CustomerComponent } from './customer/customer.component';
import { EmployeeComponent } from './employee/employee.component';
import { InterestCalculationComponent } from './interest-calculation/interest-calculation.component';
import { ParentToChildInputComponent } from './parent-to-child-input/parent-to-child-input.component';
import { PipeExampleComponent } from './pipe-example/pipe-example.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  { path: 'calculator', component: CalculatorComponent },
  { path: 'calculator1', component: Calculator1Component },
  { path: 'customer', component: CustomerComponent },
  { path: 'employee', component: EmployeeComponent },
  { path: 'interest_calculation', component: InterestCalculationComponent },
  { path: 'pipe_example', component: PipeExampleComponent },
  { path: 'user', component: UserComponent },
  { path: 'book', component: BookComponent },
  { path: 'parent', component: ParentToChildInputComponent }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
 }
