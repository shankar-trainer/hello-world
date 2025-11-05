import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {PersonComponent} from './person/person.component';
import { ProductComponent } from "./product/product.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, PersonComponent, ProductComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'myapp1';
}
