import { createReducer, on } from '@ngrx/store';
import { addItem, removeItem } from './cart.actions';
import { CartState } from '../models/product.model';

const initialState: CartState = { items: [] };

export const cartReducer = createReducer(
  initialState,
  on(addItem, (state, { item }) => ({ ...state, items: [...state.items, item] })),
  on(removeItem, (state, { id }) => ({ ...state, items: state.items.filter(item => item.id !== id) }))
);
