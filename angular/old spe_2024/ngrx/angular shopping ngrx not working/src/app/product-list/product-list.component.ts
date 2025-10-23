import { Component } from '@angular/core';
	import { Store } from '@ngrx/store';
	import { addItemToCart } from '../store/cart.actions';
	import {  CartItem } from '../store/cart.state';
import { AppState } from '../store/app.state';

	@Component({
	  selector: 'app-product-list',
	  template: `
		<button (click)="onAddToCart(product)">Add to Cart</button>
	  `,
	})
	export class ProductListComponent {
	  product = { id: '1', name: 'Product A', price: 19.99 }; // Example product

	  constructor(private store: Store<AppState>) {}

	  onAddToCart(item: Omit<CartItem, 'quantity'>) {
		this.store.dispatch(addItemToCart({ item }));
	  }

	}
