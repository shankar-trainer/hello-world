import { createAction, props } from '@ngrx/store';
import { Product } from './store.model';

export const addProductToCart = createAction(
  '[Cart] Add Product To Cart',
  props<{ product: Product }>()
);

export const removeProductFromCart = createAction(
  '[Cart] Remove Product From Cart',
  props<{ productId: number }>()
);

export const updateProductQuantity = createAction(
  '[Cart] Update Product Quantity',
  props<{ productId: number; quantity: number }>()
);

export const clearCart = createAction('[Cart] Clear Cart');
