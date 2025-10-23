import {Component} from '@angular/core';
import {Store} from '@ngrx/store';
import {selectCartItems, selectCartTotal} from '../store/cart.selectors';
import {CommonModule} from '@angular/common';
import {FormsModule} from '@angular/forms';
import {AppState} from '../store/app.state';

@Component({
  selector: 'app-cart',
  imports: [CommonModule, FormsModule],
  template: `
    <div *ngFor="let item of cartItems$ | async">
      {{ item.name }} - {{ item.quantity }} x {{ item.price | currency }}
    </div>
    <div>Total: {{ cartTotal$ | async | currency }}</div>
  `,
})
export class CartComponent {
  //store: Store<AppState>;

  constructor(private store: Store<AppState>) {
    // this.store=new Store();
  }


  cartItems$ = this.store.select(selectCartItems);
  cartTotal$ = this.store.select(selectCartTotal);


}
