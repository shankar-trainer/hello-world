import { createFeatureSelector, createSelector } from '@ngrx/store';
import { CartState } from './store.model';

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
