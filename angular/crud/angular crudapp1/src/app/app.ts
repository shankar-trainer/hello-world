import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Allbook } from "./allbook/allbook";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Allbook],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('crudapp1');
}
