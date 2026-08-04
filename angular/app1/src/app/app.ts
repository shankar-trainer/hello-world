import { Component, signal } from '@angular/core';
import { RouterOutlet, RouterLinkWithHref } from '@angular/router';
import { Employee } from "./employee/employee";
import { ReactiveForm } from './reactive-form/reactive-form';
import { Calculator } from "./calculator/calculator";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Employee, ReactiveForm, Calculator, RouterLinkWithHref],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  // protected readonly title = signal('app1');
}
