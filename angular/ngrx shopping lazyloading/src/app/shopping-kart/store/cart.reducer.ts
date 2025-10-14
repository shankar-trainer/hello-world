import { createReducer, on } from "@ngrx/store";
import { initialState } from "./cart.state";
import * as CartActions from './cart.actions';

export const cartReducer = createReducer(
  initialState,
  on(CartActions.addItem, (state, { item }) => {
    const existingItem = state.items.find(cartItem => cartItem.id === item.id);
    if (existingItem) {
      // If item exists, update its quantity
      return {
        ...state,
        items: state.items.map(cartItem =>
          cartItem.id === item.id
            ? { ...cartItem, quantity: cartItem.quantity + 1 }
            : cartItem
        ),
      };
    } else {
      // If new item, add it to the cart
      return {
        ...state,
        items: [...state.items, { ...item, quantity: 1 }],
      };
    }
  }),
  on(CartActions.removeItem, (state, { itemId }) => ({
    ...state,
    items: state.items.filter(item => item.id !== itemId),
  })),
  on(CartActions.updateItemQuantity, (state, { itemId, quantity }) => {
    const updatedItems = state.items.map(item =>
      item.id === itemId
        ? { ...item, quantity: item.quantity + quantity }
        : item
    ).filter(item => item.quantity > 0); // Remove item if quantity becomes 0 or less
    
    return {
      ...state,
      items: updatedItems,
    };
  }),
  on(CartActions.clearCart, () => initialState)
);
