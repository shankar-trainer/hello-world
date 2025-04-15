import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {EmployeeComponent} from './employee/employee.component';
import {ChildComponent} from './child/child.component';
import {ParentComponent} from './parent/parent.component';
import {CounterComponent} from './counter/counter.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, EmployeeComponent,ParentComponent, ChildComponent,CounterComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

}
