import { Component } from '@angular/core';
import {CommonModule} from '@angular/common';
import {FormsModule} from '@angular/forms';
import {CartComponent} from './cart/cart.component';

@Component({
  imports:[CommonModule,FormsModule,CartComponent],
  selector: 'app-root',
  template: `
    <div class="app-container">
      <app-cart></app-cart>
    </div>
  `,
  styles: [`
    .app-container {
      padding: 20px;
    }
  `]
})
export class AppComponent {}
