import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { CustomerComponent } from './customer/customer.component';
import { UserComponent } from './user/user.component';
import { InterestCalculationComponent } from './interest-calculation/interest-calculation.component';
import {FormsModule} from '@angular/forms';
import { PipeExampleComponent } from './pipe-example/pipe-example.component';
import { SqrtPrgPipe } from './pipe-example/pipe/sqrt-prg.pipe';
import { PowerPipe } from './pipe-example/pipe/power.pipe';
import { EmployeeComponent } from './employee/employee.component';
import { BookComponent } from './book/book.component';
import { Calculator1Component } from './calculator1/calculator1.component';
import { ParentToChildInputComponent } from './parent-to-child-input/parent-to-child-input.component';
import { Parent1Component } from './parent-to-child-input/parent1/parent1/parent1.component';
import { ParentComponent } from './parent-to-child-input/parent/parent/parent.component';
import { Child1Component } from './parent-to-child-input/child1/child1/child1.component';
import { ChildComponent } from './parent-to-child-input/child/child.component';

@NgModule({
  declarations: [
    AppComponent,
    CalculatorComponent,
    CustomerComponent,
    UserComponent,
    InterestCalculationComponent,
    PipeExampleComponent,
    SqrtPrgPipe,
    PowerPipe,
    EmployeeComponent,
    BookComponent,
    Calculator1Component,
    ParentToChildInputComponent,
    Parent1Component,
    ParentComponent,
    Child1Component,
    ChildComponent
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
