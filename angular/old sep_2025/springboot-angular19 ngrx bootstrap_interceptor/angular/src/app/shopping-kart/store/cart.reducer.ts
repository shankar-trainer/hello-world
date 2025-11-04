import { createReducer, on } from '@ngrx/store';
import * as CartActions from './cart.actions';
import { CartState } from './store.model';

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
