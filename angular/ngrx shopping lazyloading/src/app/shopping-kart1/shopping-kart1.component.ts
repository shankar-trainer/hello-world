import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { addProductToCart, removeProductFromCart } from './action/cart.action';
import { Observable } from 'rxjs';
import { Store } from '@ngrx/store';
import { selectCartItems, selectCartTotalItems, selectCartTotalPrice } from './selector/cart.selector';

import { Product } from "./store/product";


@Component({
  selector: 'app-shopping-kart1',
  imports: [CommonModule],
  templateUrl: './shopping-kart1.component.html',
  styleUrl: './shopping-kart1.component.css',
  
})
export class ShoppingKart1Component {
  cartItems$: Observable<Product[]>;
  totalItems$: Observable<number>;
  totalPrice$: Observable<number>;

  constructor(private store: Store) {
    this.cartItems$ = this.store.select(selectCartItems);
    this.totalItems$ = this.store.select(selectCartTotalItems);
    this.totalPrice$ = this.store.select(selectCartTotalPrice);
  }

  addItem() {
    const newProduct: Product = { id: 10, name: 'Example Product', price: 25, quantity: 1 };
    this.store.dispatch(addProductToCart({ product: newProduct }));
  }

  removeItem(productId: number) {
    this.store.dispatch(removeProductFromCart({ productId }));
  }

}
