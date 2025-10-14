import { createReducer, on } from '@ngrx/store';
import { addProductToCart, removeProductFromCart, updateProductQuantity } from '../action/cart.action';
import { CartState } from '../store/cart.state';

const initialState: CartState = {
  items: []
};

export const cartReducer = createReducer(
  initialState,
  on(addProductToCart, (state, { product }) => ({
    ...state,
    items: [...state.items, { ...product, quantity: 1 }] // Add new product with quantity 1
  })),
  on(removeProductFromCart, (state, { productId }) => ({
    ...state,
    items: state.items.filter(item => item.id !== productId)
  })),
  on(updateProductQuantity, (state, { productId, quantity }) => ({
    ...state,
    items: state.items.map(item =>
      item.id === productId ? { ...item, quantity } : item
    )
  }))
);
