import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink, RouterOutlet } from '@angular/router';
import { EmployeeComponent } from "./employee/employee.component";
import { CustomerComponent } from './customer/customer.component';
import { PersonComponent } from './person/person.component';
import { PipeExampleComponent } from './pipe-example/pipe-example.component';
import { UserComponent } from './user/user.component';
import { BookComponent } from './book/book.component';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [CommonModule, RouterOutlet, EmployeeComponent,
       CustomerComponent, PersonComponent, PipeExampleComponent, UserComponent,BookComponent,
      RouterLink
      ]
})
export class AppComponent {
  title = 'Project1';
}
