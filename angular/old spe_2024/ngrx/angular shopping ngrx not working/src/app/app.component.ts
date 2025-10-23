import { Component } from '@angular/core';
import {RouterLink, RouterOutlet} from '@angular/router';
import {ProductListComponent} from './product-list/product-list.component';
import {CartComponent} from './cart/cart.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,RouterLink,ProductListComponent,CartComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angular_ngrx';
}
