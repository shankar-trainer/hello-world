import { createAction, props } from '@ngrx/store';
import { Product } from '../store/product';

export const addProductToCart = createAction(
  '[Cart] Add Product',
  props<{ product: Product }>()
);

export const removeProductFromCart = createAction(
  '[Cart] Remove Product',
  props<{ productId: number }>()
);

export const updateProductQuantity = createAction(
  '[Cart] Update Product Quantity',
  props<{ productId: number; quantity: number }>()
);
