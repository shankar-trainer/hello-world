import { Component } from '@angular/core';

import { EmployeeComponent } from './employee/employee.component';
import { UserComponent } from './user/user.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { PowerPipe } from './user/pipe/power.pipe';
import { TemplatedrivenComponent } from './templatedriven/templatedriven.component';
import { ReactiveformComponent } from './reactiveform/reactiveform.component';
import {RouterLink, RouterOutlet} from '@angular/router';
import {CustomerComponent} from './customer/customer.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet
    ,EmployeeComponent,UserComponent,CalculatorComponent
    ,PowerPipe,TemplatedrivenComponent,ReactiveformComponent,RouterLink,CustomerComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  // title = 'App2';
  // id:number=100001;
}
