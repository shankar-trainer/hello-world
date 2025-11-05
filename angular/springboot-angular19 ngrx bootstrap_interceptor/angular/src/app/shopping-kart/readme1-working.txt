Creating a complete, runnable NgRx shopping cart example from scratch in this format is not feasible due to the complexity and multiple files involved. A full NgRx application requires a structured file system with components, services, actions, reducers, effects, and selectors, and it's best to follow a tutorial or use a sample project on a platform like StackBlitz or GitHub.

However, I can provide you with a detailed breakdown of the key concepts and code snippets for each part of an NgRx shopping cart application. This will give you the blueprint you need to build it yourself or understand an existing example.

The NgRx Shopping Cart Blueprint
An NgRx application for a shopping cart will typically have the following components and files:

State Interface: Defines the shape of your application's state.

Actions: Define the events that can happen in your application (e.g., adding a product, removing one).

Reducers: Pure functions that take the current state and an action, and return a new, updated state.

Effects: Handle side effects like API calls.

Selectors: Functions that select a slice of the state from the store.

Store Configuration: The main module where you configure your store.

Components: The UI parts of your application that dispatch actions and select data from the store.

1. State Interface (cart.state.ts)
This file defines the structure of your shopping cart state. It's often a good practice to define an interface for the individual product as well.

TypeScript

// src/app/store/cart.state.ts

export interface Product {
  id: number;
  name: string;
  price: number;
}

export interface CartItem {
  product: Product;
  quantity: number;
}

export interface CartState {
  items: CartItem[];
}
2. Actions (cart.actions.ts)
Actions are the events that trigger state changes. It's common to group related actions together.

TypeScript

// src/app/store/cart.actions.ts

import { createAction, props } from '@ngrx/store';
import { Product } from './cart.state';

export const addProductToCart = createAction(
  '[Cart] Add Product To Cart',
  props<{ product: Product }>()
);

export const removeProductFromCart = createAction(
  '[Cart] Remove Product From Cart',
  props<{ productId: number }>()
);

export const updateProductQuantity = createAction(
  '[Cart] Update Product Quantity',
  props<{ productId: number; quantity: number }>()
);

export const clearCart = createAction('[Cart] Clear Cart');
3. Reducers (cart.reducer.ts)
The reducer is the core of state management. It handles each action and returns a new state. Remember, reducers must be pure functions—they should not modify the existing state.

TypeScript

// src/app/store/cart.reducer.ts

import { createReducer, on } from '@ngrx/store';
import { CartState } from './cart.state';
import * as CartActions from './cart.actions';

const initialState: CartState = {
  items: [],
};

export const cartReducer = createReducer(
  initialState,
  on(CartActions.addProductToCart, (state, { product }) => {
    // Check if the product is already in the cart
    const existingItem = state.items.find((item) => item.product.id === product.id);

    if (existingItem) {
      // If it exists, update the quantity
      return {
        ...state,
        items: state.items.map((item) =>
          item.product.id === product.id
            ? { ...item, quantity: item.quantity + 1 }
            : item
        ),
      };
    } else {
      // If it's a new product, add it to the cart
      return {
        ...state,
        items: [...state.items, { product, quantity: 1 }],
      };
    }
  }),
  on(CartActions.removeProductFromCart, (state, { productId }) => ({
    ...state,
    items: state.items.filter((item) => item.product.id !== productId),
  })),
  on(CartActions.updateProductQuantity, (state, { productId, quantity }) => {
    if (quantity <= 0) {
      return {
        ...state,
        items: state.items.filter((item) => item.product.id !== productId),
      };
    } else {
      return {
        ...state,
        items: state.items.map((item) =>
          item.product.id === productId ? { ...item, quantity } : item
        ),
      };
    }
  }),
  on(CartActions.clearCart, (state) => initialState)
);
4. Selectors (cart.selectors.ts)
Selectors are used to retrieve specific pieces of data from the store. They are memoized for performance, meaning they only re-compute if their inputs change.

TypeScript

// src/app/store/cart.selectors.ts

import { createFeatureSelector, createSelector } from '@ngrx/store';
import { CartState } from './cart.state';

export const selectCartState = createFeatureSelector<CartState>('cart');

export const selectCartItems = createSelector(
  selectCartState,
  (state: CartState) => state.items
);

export const selectCartTotal = createSelector(
  selectCartState,
  (state: CartState) =>
    state.items.reduce(
      (total, item) => total + item.product.price * item.quantity,
      0
    )
);

export const selectCartItemCount = createSelector(
  selectCartState,
  (state: CartState) =>
    state.items.reduce((count, item) => count + item.quantity, 0)
);
5. Module Configuration (app.module.ts)
You need to configure your NgRx store in your main Angular module. This is where you tell NgRx about your reducers and effects.

TypeScript

// src/app/app.module.ts

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { StoreModule } from '@ngrx/store';
import { StoreDevtoolsModule } from '@ngrx/store-devtools';
import { AppComponent } from './app.component';
import { cartReducer } from './store/cart.reducer';

@NgModule({
  declarations: [
    AppComponent,
    // Other components...
  ],
  imports: [
    BrowserModule,
    StoreModule.forRoot({ cart: cartReducer }), // 'cart' is the state key
    StoreDevtoolsModule.instrument({ maxAge: 25, logOnly: !isDevMode() }), // Optional for devtools
    // Other modules...
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
6. Component Usage (product-list.component.ts and cart.component.ts)
Finally, your components will interact with the store by dispatching actions and selecting data.

Product List Component (product-list.component.ts)

TypeScript

// src/app/product-list/product-list.component.ts

import { Component } from '@angular/core';
import { Store } from '@ngrx/store';
import { Product } from '../store/cart.state';
import * as CartActions from '../store/cart.actions';

@Component({
  selector: 'app-product-list',
  template: `
    <h2>Products</h2>
    <ul>
      <li *ngFor="let product of products">
        {{ product.name }} - ${{ product.price }}
        <button (click)="addToCart(product)">Add to Cart</button>
      </li>
    </ul>
  `,
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
Cart Component (cart.component.ts)

TypeScript

// src/app/cart/cart.component.ts

import { Component } from '@angular/core';
import { Store } from '@ngrx/store';
import { Observable } from 'rxjs';
import { CartItem } from '../store/cart.state';
import * as CartSelectors from '../store/cart.selectors';
import * as CartActions from '../store/cart.actions';

@Component({
  selector: 'app-cart',
  template: `
    <h2>Shopping Cart</h2>
    <div *ngIf="cartItems$ | async as items">
      <ul *ngIf="items.length > 0; else emptyCart">
        <li *ngFor="let item of items">
          {{ item.product.name }} - Quantity: {{ item.quantity }} - Total: ${{ item.product.price * item.quantity }}
          <button (click)="removeFromCart(item.product.id)">Remove</button>
          <button (click)="updateQuantity(item.product.id, item.quantity - 1)">-</button>
          <button (click)="updateQuantity(item.product.id, item.quantity + 1)">+</button>
        </li>
      </ul>
      <ng-template #emptyCart>
        <p>Your cart is empty.</p>
      </ng-template>

      <div *ngIf="items.length > 0">
        <h3>Total: ${{ cartTotal$ | async }}</h3>
        <button (click)="clearCart()">Clear Cart</button>
      </div>
    </div>
  `,
})
export class CartComponent {
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
Next Steps
To build a full, working application, you would also need to:

Create the necessary components and their templates (product-list.component.html, cart.component.html, etc.).

Set up routing if you have different pages.

Add NgRx Effects to handle asynchronous operations, such as fetching products from a backend API.

Use the NgRx DevTools extension for Chrome or Firefox to see your state changes in real-time.

For a complete, copy-paste example, I highly recommend searching for a "shopping cart NgRx StackBlitz" or "NgRx shopping cart GitHub" to find a pre-built project you can explore and learn from.







