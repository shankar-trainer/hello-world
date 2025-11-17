import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import {CounterComponent} from './counter/counter.component';
import {Counter1Component} from './counter1/counter1.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, RouterLink,CounterComponent,Counter1Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'app1';
}
