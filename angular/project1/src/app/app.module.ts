import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import  { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { CustomerComponent } from './customer/customer.component';
import { PersonComponent } from './person/person.component';
import { BookComponent } from './book/book.component';
import { UserComponent } from './user/user.component'
import { EmployeeComponent } from './employee/employee.component'
import { ProductComponent } from './product/product.component'
import { MathPipePipe } from './employee/math-pipe.pipe';
import { ExpPipePipe } from './employee/exp-pipe.pipe';
import { EmpDirectiveDirective } from './employee/emp-directive.directive';
import { MyproductComponent } from './myproduct/myproduct.component';

import {HttpClientModule} from '@angular/common/http';
import { SearchproductComponent } from './searchproduct/searchproduct.component';


@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    PersonComponent,
    BookComponent,
    UserComponent,
    EmployeeComponent,
    ProductComponent,
    EmpDirectiveDirective,
    MathPipePipe,
    ExpPipePipe,
    MyproductComponent,
    SearchproductComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
        ReactiveFormsModule,
        HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }