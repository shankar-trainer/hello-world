import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CalculatorComponent } from './calculator/calculator.component';
import { EmployeeComponent } from './employee/employee.component';
import { InterestComponent } from './interest/interest.component';
import { StudentComponent } from './student/student.component';

const routes: Routes = [
   { path: '', component: CalculatorComponent },
  { path: 'calculator', component: CalculatorComponent },
  { path: 'employee', component: EmployeeComponent },
  { path: 'interest', component: InterestComponent },
  { path: 'student', component: StudentComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
