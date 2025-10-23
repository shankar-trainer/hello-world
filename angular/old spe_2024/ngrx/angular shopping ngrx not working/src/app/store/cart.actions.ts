import { createAction, props } from '@ngrx/store';
import { CartItem } from './cart.state';

export const addItemToCart = createAction(
    '[Cart] Add Item to Cart',
    props<{ item: Omit<CartItem, 'quantity'> }>()
);

export const removeItemFromCart = createAction(
    '[Cart] Remove Item from Cart',
    props<{ itemId: string }>()
);

export const updateItemQuantity = createAction(
    '[Cart] Update Item Quantity',
    props<{ itemId: string, quantity: number }>()
);
