import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { ProductComponent } from './product/product.component';
import { StudentComponent } from './student/student.component';
import { FormsModule } from '@angular/forms';
import { CalculatorComponent } from './calculator/calculator.component';
import { ExponentPipe } from './exponent.pipe';
import { EmployeeComponent } from './employee/employee.component';
import { User1Component } from './user1/user1.component';
import { SurveyComponent } from './survey/survey.component';
import { HeroFormComponent } from './hero-form/hero-form.component';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    ProductComponent,
    StudentComponent,
    CalculatorComponent,
    ExponentPipe,
    EmployeeComponent,
    User1Component,
    SurveyComponent,
    HeroFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
