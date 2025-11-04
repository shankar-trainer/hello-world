import { Component } from '@angular/core';
import { Store } from '@ngrx/store';
import * as CartActions from './store/cart.actions'
// import * as CartActions from '../store/cart.actions';
import { Product } from './store/store.model';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-product-list',
  imports: [CommonModule],
  templateUrl: './product-list.component.html'
})

export class ProductListComponent {
  products: Product[] = [
    { id: 1, name: 'Laptop', price: 1200 },
    { id: 2, name: 'Mouse', price: 50 },
    { id: 3, name: 'Keyboard', price: 100 },
  ];

  constructor(private store: Store) {}

  addToCart(product: Product): void {
    this.store.dispatch(CartActions.addProductToCart({ product }));
  }
}
