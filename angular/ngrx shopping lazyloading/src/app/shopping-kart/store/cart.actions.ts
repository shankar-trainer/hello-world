import { createAction, props } from "@ngrx/store";
import { Product } from "../model/Product";

export const addItem = createAction(
    '[Cart] Add Item',
    props<{ item: Product }>()
);

export const removeItem = createAction(
    '[Cart] Remove Item',
    props<{ itemId: string }>()
);

export const updateItemQuantity = createAction(
    '[Cart] Update Item Quantity',
    props<{ itemId: string; quantity: number }>()
);

export const clearCart = createAction(
    '[Cart] Clear Cart'
);
