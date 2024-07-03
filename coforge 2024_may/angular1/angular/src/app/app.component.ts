import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { EmployeeComponent } from './employee/employee.component';
import { CustomerComponent } from './customer/customer.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { PersonComponent } from './person/person.component';
import { TemplateFormComponent } from './template-form/template-form.component';
import { PersonAppComponent } from './person-app/person-app.component';
import { AddpersonComponent } from './addperson/addperson.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,EmployeeComponent,CustomerComponent,CalculatorComponent,
  PersonComponent,TemplateFormComponent,PersonAppComponent,
  RouterLink,AddpersonComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'AngularApp1';
}
