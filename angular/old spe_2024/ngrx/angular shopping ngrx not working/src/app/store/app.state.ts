import { CartItem } from "./cart.state";

export interface AppState {
    cart: {
      items: CartItem[];
    };
    // Potentially other state branches, like `products` or `user`
  }