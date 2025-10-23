ngrx shopping cart example
Implementing a shopping cart with NgRx involves creating a predictable data flow that uses a central store to manage the state of your application. The core components of an NgRx setup are Actions, Reducers, Selectors, and the Store itself. 
Here is a step-by-step example of how to build a shopping cart with NgRx.
Step 1: Install NgRx
Begin by adding NgRx to your Angular project using the Angular CLI: 
bash
ng add @ngrx/store
ng add @ngrx/effects
ng add @ngrx/store-devtools

Use code with caution.

The store-devtools package is highly recommended for debugging and offers a Redux DevTools browser extension for inspecting state changes. 
Step 2: Define the state

The cart state is where your data is stored. Define the structure for your cart and products. 
src/app/cart/cart.state.ts
typescript
import { Product } from '../product-list/product.model';

export interface CartState {
  items: Product[];
  totalPrice: number;
}

export const initialState: CartState = {
  items: [],
  totalPrice: 0,
};
Use code with caution.

Step 3: Create the actions
Actions are unique events that describe what happened. Name them using the [Source] Event pattern, such as [Product List] Add Item to Cart. 
src/app/cart/cart.actions.ts
typescript
import { createAction, props } from '@ngrx/store';
import { Product } from '../product-list/product.model';

export const addItem = createAction(
  '[Product List] Add Item to Cart',
  props<{ product: Product }>()
);

export const removeItem = createAction(
  '[Cart] Remove Item from Cart',
  props<{ productId: number }>()
);
Use code with caution.

Step 4: Write the reducer
The reducer is a pure function that takes the current state and an action and returns a new, updated state. 
src/app/cart/cart.reducer.ts 
typescript
import { createReducer, on } from '@ngrx/store';
import { initialState } from './cart.state';
import * as CartActions from './cart.actions';

export const cartReducer = createReducer(
  initialState,
  on(CartActions.addItem, (state, { product }) => ({
    ...state,
    items: [...state.items, product],
    totalPrice: state.totalPrice + product.price,
  })),
  on(CartActions.removeItem, (state, { productId }) => {
    const updatedItems = state.items.filter(item => item.id !== productId);
    const updatedPrice = updatedItems.reduce((acc, item) => acc + item.price, 0);

    return {
      ...state,
      items: updatedItems,
      totalPrice: updatedPrice,
    };
  })
);
Use code with caution.

Step 5: Create the selectors
Selectors are pure functions used to retrieve slices of data from the store, which can be shared across multiple components. 
src/app/cart/cart.selectors.ts
typescript
import { createFeatureSelector, createSelector } from '@ngrx/store';
import { CartState } from './cart.state';

export const selectCartState = createFeatureSelector<CartState>('cart');

export const selectCartItems = createSelector(
  selectCartState,
  (state: CartState) => state.items
);

export const selectCartTotal = createSelector(
  selectCartState,
  (state: CartState) => state.totalPrice
);
Use code with caution.

Step 6: Add the cart state to your app module
To make the state available to your entire application, register the reducer in app.module.ts. 
src/app/app.module.ts
typescript
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { StoreModule } from '@ngrx/store';
import { cartReducer } from './cart/cart.reducer';
import { AppComponent } from './app.component';

@NgModule({
  imports: [
    BrowserModule,
    StoreModule.forRoot({ cart: cartReducer }), // Register the cart reducer
  ],
  declarations: [AppComponent],
  bootstrap: [AppComponent],
})
export class AppModule {}
Use code with caution.

Step 7: Connect components to the store
In your components, you will dispatch actions to update the state and use selectors to read the state. 
Product List component
This component dispatches the addItem action when a user clicks a button. 
src/app/product-list/product-list.component.ts 
typescript
import { Component } from '@angular/core';
import { Store } from '@ngrx/store';
import { addItem } from '../cart/cart.actions';
import { Product } from './product.model';

@Component({ ... })
export class ProductListComponent {
  constructor(private store: Store) {}

  onAddToCart(product: Product) {
    this.store.dispatch(addItem({ product }));
  }
}
Use code with caution.

Cart component
This component uses selectors to display the cart's items and total price. 
src/app/cart/cart.component.ts
typescript
import { Component } from '@angular/core';
import { Store } from '@ngrx/store';
import { selectCartItems, selectCartTotal } from './cart.selectors';
import { removeItem } from './cart.actions';

@Component({ ... })
export class CartComponent {
  cartItems$ = this.store.select(selectCartItems);
  cartTotal$ = this.store.select(selectCartTotal);

  constructor(private store: Store) {}

  onRemoveItem(productId: number) {
    this.store.dispatch(removeItem({ productId }));
  }
}
Use code with caution.

Cart component template
You can use the async pipe to subscribe to the observables in your template. 
src/app/cart/cart.component.html 
html
<div class="cart">
  <h2>Shopping Cart</h2>
  <ul>
    <li *ngFor="let item of (cartItems$ | async)">
      {{ item.name }} - ${{ item.price }}
      <button (click)="onRemoveItem(item.id)">Remove</button>
    </li>
  </ul>
  <h3>Total: ${{ cartTotal$ | async }}</h3>
</div>
============

angular ngrx shopping cart example
Building a shopping cart with Angular and NgRx involves creating a predictable state container to manage the cart's contents, and using a structured flow of Actions, Reducers, and Selectors. This approach provides a centralized, easy-to-debug state for your application. 
Example components and NgRx setup
A typical application is built with distinct components for product display and cart management. 
The NgRx triad
Actions: Events dispatched from components to describe what happened, such as [Cart] Add Item or [Cart] Remove Item.
Reducers: Functions that handle state transitions. Based on a dispatched Action, a Reducer takes the current state and returns a new, immutable state.
Selectors: Functions that read slices of data from the state, making it easy for components to retrieve specific information, like the total number of items in the cart. 
Step-by-step implementation
1. Install NgRx and define the state
Use the Angular CLI to add the necessary NgRx packages. 
bash
ng add @ngrx/store
ng add @ngrx/effects # If you need to handle asynchronous data, like fetching products
ng add @ngrx/store-devtools # Optional, for debugging
Use code with caution.

Create an interface for your application's state and define the initial state. 
src/app/store/state.model.ts
typescript
import { Product } from '../product.model';

export interface AppState {
  shop: ShopState;
}

export interface ShopState {
  products: Product[];
  cart: Product[];
}

export const initialState: ShopState = {
  products: [],
  cart: []
};
Use code with caution.

2. Create Actions
Use the createActionGroup function to define a set of actions for your cart. 
src/app/store/cart.actions.ts
typescript
import { createActionGroup, props } from '@ngrx/store';
import { Product } from '../product.model';

export const CartActions = createActionGroup({
  source: 'Cart',
  events: {
    'Add Item': props<{ product: Product }>(),
    'Remove Item': props<{ productId: number }>(),
    'Load Items': props<{ products: Product[] }>(),
  },
});
Use code with caution.

3. Write the Reducer
The reducer function handles the state changes. It is a pure function that takes the current state and an action, and returns a new state. 
src/app/store/cart.reducer.ts 
typescript
import { createReducer, on } from '@ngrx/store';
import { initialState } from './state.model';
import { CartActions } from './cart.actions';

export const cartReducer = createReducer(
  initialState,
  on(CartActions.addItem, (state, { product }) => ({
    ...state,
    cart: [...state.cart, product]
  })),
  on(CartActions.removeItem, (state, { productId }) => ({
    ...state,
    cart: state.cart.filter(p => p.id !== productId)
  })),
  on(CartActions.loadItems, (state, { products }) => ({
    ...state,
    products: products
  }))
);
Use code with caution.

4. Define Selectors
Selectors are functions that allow components to observe slices of the state. This helps avoid unnecessary component re-renders. 
src/app/store/cart.selectors.ts 
typescript
import { createFeatureSelector, createSelector } from '@ngrx/store';
import { AppState, ShopState } from './state.model';

export const selectShopState = createFeatureSelector<ShopState>('shop');

export const selectProducts = createSelector(
  selectShopState,
  (state: ShopState) => state.products
);

export const selectCart = createSelector(
  selectShopState,
  (state: ShopState) => state.cart
);
Use code with caution.

5. Integrate into the Module
Register the reducer in your main application module. 
src/app/app.module.ts
typescript
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { StoreModule } from '@ngrx/store';
import { cartReducer } from './store/cart.reducer';
import { AppComponent } from './app.component';
import { StoreDevtoolsModule } from '@ngrx/store-devtools';

@NgModule({
  declarations: [AppComponent],
  imports: [
    BrowserModule,
    StoreModule.forRoot({ shop: cartReducer }),
    StoreDevtoolsModule.instrument({ maxAge: 25, logOnly: false })
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
Use code with caution.

6. Use the state in components
Inject the Store service into your components. To add an item, dispatch an action. To display cart items, use selectors to get an Observable of the cart state and use the async pipe. 
src/app/product-list/product-list.component.ts 
typescript
import { Component } from '@angular/core';
import { Store } from '@ngrx/store';
import { AppState } from '../store/state.model';
import { CartActions } from '../store/cart.actions';
import { Product } from '../product.model';

@Component({...})
export class ProductListComponent {
  constructor(private store: Store<AppState>) {}

  products: Product[] = [
    { id: 1, name: 'Product A', price: 25 },
    { id: 2, name: 'Product B', price: 45 },
  ];

  addToCart(product: Product): void {
    this.store.dispatch(CartActions.addItem({ product }));
  }
}
Use code with caution.

src/app/cart/cart.component.ts
typescript
import { Component } from '@angular/core';
import { Store } from '@ngrx/store';
import { Observable } from 'rxjs';
import { AppState } from '../store/state.model';
import { selectCart } from '../store/cart.selectors';
import { CartActions } from '../store/cart.actions';
import { Product } from '../product.model';

@Component({...})
export class CartComponent {
  cart$: Observable<Product[]>;

  constructor(private store: Store<AppState>) {
    this.cart$ = this.store.select(selectCart);
  }

  removeFromCart(productId: number): void {
    this.store.dispatch(CartActions.removeItem({ productId }));
  }
}
Use code with caution.

7. Display cart content
In your cart.component.html, you can display the cart contents with the async pipe. 
html
<h2>Shopping Cart</h2>
<div *ngFor="let item of cart$ | async">
  <span>{{ item.name }} - ${{ item.price }}</span>
  <button (click)="removeFromCart(item.id)">Remove</button>
</div>


==========
A complete NGRX shopping cart example involves setting up an Angular project with NGRX for state management, defining actions to add/remove items, creating a reducer to manage the state, using a selector to retrieve the cart data, and finally implementing components to display products, interact with the cart, and trigger these actions using the Store service. You can find complete examples by looking for GitHub repositories and demo projects like those on Telerik.com and StackBlitz. 
Key NGRX Concepts for a Shopping Cart
Actions: Events that describe what happened, like addToCart or removeFromCart. 
Reducers: Pure functions that take the current state and an action, returning a new state. 
Selectors: Functions that select a specific piece of state from the store. 
Store: The central hub that holds the application state. 
Effects (Optional): Used for handling asynchronous operations, such as fetching product data from an API. 
Steps to Build a Shopping Cart
Set up NgRx: Install the NGRX libraries and configure NGRX in your app.module.ts by adding the StoreModule with your root reducer. 
Define Actions: Create an actions.ts file to define ActionTypes and actions for adding and removing items. 
Create a Reducer: In reducer.ts, implement the ShopReducer to handle these actions and update the cart state. 
Use Selectors: Create a product.selectors.ts file to define selectors for accessing the cart data from the store. 
Create Components:

Product List Component: Displays products and has "Add to Cart" buttons. 

Cart Component: Shows the items currently in the cart. 
Dispatch Actions: In your components, use the Store service to dispatch actions when users interact with the "Add" or "Remove" buttons. 

Subscribe to State: Use select to subscribe to the cart state in your components, allowing the UI to update automatically when the cart changes. 
Where to Find Complete Examples

GitHub: Explore comprehensive examples of NgRx for shopping carts, often featuring product catalogs and the core components of NgRx (Store, Actions, Selectors, Reducers, and Effects). 
StackBlitz: Find interactive demos and code examples for NGRX shopping cart applications. 
YouTube: Watch step-by-step tutorials that guide you through building a complete Angular e-commerce app with an NGRX shopping cart. 
