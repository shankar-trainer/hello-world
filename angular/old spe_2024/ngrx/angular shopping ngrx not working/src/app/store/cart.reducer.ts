import { createReducer, on } from '@ngrx/store';
	import { addItemToCart, removeItemFromCart, updateItemQuantity } from './cart.actions';
import {AppState} from './app.state';
//	import { AppState } from './cart.state';

	export const initialState: AppState = {
	  cart: {
		items: []
	  }
	};

	export const cartReducer = createReducer(
	  initialState,
	  on(addItemToCart, (state, { item }) => {
		const existingItem = state.cart.items.find(cartItem => cartItem.id === item.id);
		if (existingItem) {
		  return {
			...state,
			cart: {
			  items: state.cart.items.map(cartItem =>
				cartItem.id === item.id ? { ...cartItem, quantity: cartItem.quantity + 1 } : cartItem
			  )
			}
		  };
		} else {
		  return {
			...state,
			cart: {
			  items: [...state.cart.items, { ...item, quantity: 1 }]
			}
		  };
		}
	  }),
	  on(removeItemFromCart, (state, { itemId }) => ({
		...state,
		cart: {
		  items: state.cart.items.filter(cartItem => cartItem.id !== itemId)
		}
	  })),
	  on(updateItemQuantity, (state, { itemId, quantity }) => ({
		...state,
		cart: {
		  items: state.cart.items.map(cartItem =>
			cartItem.id === itemId ? { ...cartItem, quantity: quantity } : cartItem
		  ).filter(cartItem => cartItem.quantity > 0)
		}
	  }))
	);
