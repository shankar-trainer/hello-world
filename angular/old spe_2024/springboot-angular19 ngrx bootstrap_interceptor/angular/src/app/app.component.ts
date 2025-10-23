import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { Counterapp1Component } from './counterapp1/counterapp1.component';
import { CommonModule } from '@angular/common';
import { Parent1Component } from "./parentchild1/parent1/parent1.component";
import { Parent2Component } from "./parentchild2/parent2/parent2.component";
import { BookComponent } from './child-parent-bookhouse/book/book.component';
import { CustomerComponent } from './child-parent-bookhouse/customer/customer.component';
import { ReactiveFormComponent } from "./reactiveform/reactive-form.component";
import { ReactiveFormComponent1 } from "./reactiveform1/reactive-form.component";
import { CrudComponent } from "./crud/crud.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,RouterLink, CommonModule, Counterapp1Component, Parent1Component, Parent2Component, BookComponent, CustomerComponent, ReactiveFormComponent, ReactiveFormComponent1, CrudComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angular_ngrx';
}
