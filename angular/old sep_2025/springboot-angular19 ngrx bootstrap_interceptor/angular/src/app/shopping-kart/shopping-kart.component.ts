import { Component } from '@angular/core';
import { CartItem } from './store/store.model';
import { Observable } from 'rxjs';
import { CommonModule } from '@angular/common';
import { Store } from '@ngrx/store';
import * as CartActions from './store/cart.actions';
import * as CartSelectors from './store/cart.selector';


@Component({
  selector: 'app-shopping-kart',
  imports: [CommonModule],
  templateUrl: './shopping-kart.component.html',
  styleUrl: './shopping-kart.component.css'
})
export class ShoppingKartComponent {
  cartItems$: Observable<CartItem[]>;
  cartTotal$: Observable<number>;

  constructor(private store: Store) {
    this.cartItems$ = this.store.select(CartSelectors.selectCartItems);
    this.cartTotal$ = this.store.select(CartSelectors.selectCartTotal);
  }

  removeFromCart(productId: number): void {
    this.store.dispatch(CartActions.removeProductFromCart({ productId }));
  }

  updateQuantity(productId: number, quantity: number): void {
    this.store.dispatch(CartActions.updateProductQuantity({ productId, quantity }));
  }

  clearCart(): void {
    this.store.dispatch(CartActions.clearCart());
  }
}
