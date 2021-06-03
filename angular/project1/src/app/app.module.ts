import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { ProductComponent } from './product/product.component';
import { UserComponent } from './user/user.component';
import { FormsModule } from '@angular/forms';
import { EmpDirectiveDirective } from './employee/emp-directive.directive';
import { MathPipePipe } from './employee/math-pipe.pipe';
import { ExpPipePipe } from './employee/exp-pipe.pipe';
import { BookComponent } from './book/book.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    ProductComponent,
    UserComponent,
    EmpDirectiveDirective,
    MathPipePipe,
    ExpPipePipe,
    BookComponent
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
