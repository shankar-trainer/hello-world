import { Component } from '@angular/core';
import {  OnInit } from '@angular/core';
import { Store } from '@ngrx/store';
import { Observable } from 'rxjs';
import { Product, CartItem } from './model/Product';
import * as CartActions from './store/cart.actions';
import * as CartSelectors from './store/cart.selector';
import { CartState } from './store/cart.state';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-shopping-kart',
  imports: [CommonModule],
  templateUrl: './shopping-kart.component.html',
  styleUrl: './shopping-kart.component.css'
})
export class ShoppingKartComponent {

    products: Product[] = [
    { id: '1', name: 'Laptop', price: 1200 },
    { id: '2', name: 'Keyboard', price: 150 },
    { id: '3', name: 'Mouse', price: 75 },
  ];

  cartItems$: Observable<CartItem[]>;
  cartTotal$: Observable<number>;
  cartItemCount$: Observable<number>;

  constructor(private store: Store<CartState>) {
    this.cartItems$ = this.store.select(CartSelectors.selectCartItems);
    this.cartTotal$ = this.store.select(CartSelectors.selectCartTotal);
    this.cartItemCount$ = this.store.select(CartSelectors.selectCartItemCount);
  }

  ngOnInit(): void {}

  addToCart(item: Product): void {
    this.store.dispatch(CartActions.addItem({ item }));
  }

  removeFromCart(itemId: string): void {
    this.store.dispatch(CartActions.removeItem({ itemId }));
  }

  updateQuantity(itemId: string, quantity: number): void {
    this.store.dispatch(CartActions.updateItemQuantity({ itemId, quantity }));
  }

  clearCart(): void {
    this.store.dispatch(CartActions.clearCart());
  }

}
