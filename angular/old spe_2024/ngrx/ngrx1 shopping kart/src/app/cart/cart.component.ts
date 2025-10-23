import { Component } from '@angular/core';
import { Store } from '@ngrx/store';
import { Observable } from 'rxjs';
import { Product } from '../models/product.model';
import { addItem, removeItem } from '../store/cart.actions';
import { selectCartItems, selectCartTotal } from '../store/cart.selectors';
import {CommonModule} from '@angular/common';
import {FormsModule} from '@angular/forms';

@Component({
  imports:[CommonModule,FormsModule],
  selector: 'app-cart',
  templateUrl: './cart.component.html'
})
export class CartComponent {
  items$: Observable<Product[]>;
  total$: Observable<number>;

  constructor(private store: Store) {
    this.items$ = this.store.select(selectCartItems);
    this.total$ = this.store.select(selectCartTotal);
  }

  addDemoProduct() {
    const products = [
      'Wireless Headphones',
      'Smart Watch',
      'Laptop Stand',
      'Phone Charger',
      'Bluetooth Speaker',
      'USB-C Hub',
      'Keyboard',
      'Mouse Pad'
    ];

    const randomProduct = products[Math.floor(Math.random() * products.length)];
    const randomPrice = +(Math.random() * (299.99 - 19.99) + 19.99).toFixed(2);

    const demoProduct: Product = {
      id: Math.floor(Math.random() * 1000),
      name: randomProduct,
      price: randomPrice
    };
    this.store.dispatch(addItem({ item: demoProduct }));
  }

  removeFromCart(id: number) {
    this.store.dispatch(removeItem({ id }));
  }
}
