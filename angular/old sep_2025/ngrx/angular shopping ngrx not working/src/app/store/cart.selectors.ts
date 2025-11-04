import { createFeatureSelector, createSelector } from '@ngrx/store';
import {AppState} from './app.state';

export const selectCartState = createFeatureSelector<AppState['cart']>('cart');

export const selectCartItems = createSelector(
  selectCartState,
  (state) => state.items
);

export const selectCartTotal = createSelector(
  selectCartItems,
  (items) => items?.reduce((total, item) => total + (item.price * item.quantity), 0)
);
