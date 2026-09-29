import { Component, signal } from '@angular/core';
import { RouterOutlet, RouterLinkWithHref } from '@angular/router';
import { Employee } from './employee/employee';
import { PersonCompoment } from './person-compoment/person-compoment';
import { AddPersonComponent } from './add-person-component/add-person-component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Employee, PersonCompoment, AddPersonComponent, RouterLinkWithHref],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('App2');
}
