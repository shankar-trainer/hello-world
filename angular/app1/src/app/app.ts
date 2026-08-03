import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Employee } from "./employee/employee";
import { Book } from "./book/book";
import { Calculator } from './calculator/calculator';
import { Customer } from "./customer/customer";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Employee, Book, Calculator, Customer],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  // protected readonly title = signal('App1');
  //   age:number=45
}
