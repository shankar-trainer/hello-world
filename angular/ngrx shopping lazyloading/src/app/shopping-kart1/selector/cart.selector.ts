import { createFeatureSelector, createSelector } from '@ngrx/store';
import { CartState } from '../store/cart.state';

export const selectCartState = createFeatureSelector<CartState>('cart');

export const selectCartItems = createSelector(
  selectCartState,
  (state: CartState) => state.items
);

export const selectCartTotalItems = createSelector(
  selectCartItems,
  (items) => items.reduce((total, item) => total + item.quantity, 0)
);

export const selectCartTotalPrice = createSelector(
  selectCartItems,
  (items) => items.reduce((total, item) => total + (item.price * item.quantity), 0)
);
