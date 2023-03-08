import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { UserComponent } from './user/user.component';
import { QuestionComponent } from './question/question.component';
import { PersonComponent } from './person/person.component';
import { FormsModule } from '@angular/forms';
import { ProductComponent } from './product/product.component';
import { InterestCalculationComponent } from './interest-calculation/interest-calculation.component';
import { StudentComponent } from './student/student.component';
import { CustomerComponent } from './customer/customer.component';
import { MathProgramComponent } from './math-program/math-program.component';
import { SqrtPipe } from './math-program/sqrt.pipe';
import { ExponentPipe } from './math-program/exponent.pipe';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    UserComponent,
    QuestionComponent,
    PersonComponent,
    ProductComponent,
    InterestCalculationComponent,
    StudentComponent,
    CustomerComponent,
    MathProgramComponent,
    SqrtPipe,
    ExponentPipe,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
