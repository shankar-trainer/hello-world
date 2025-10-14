import { CartItem } from "../model/Product";

export interface CartState {
  items: CartItem[];
}

export const initialState: CartState = {
  items: [],
};
