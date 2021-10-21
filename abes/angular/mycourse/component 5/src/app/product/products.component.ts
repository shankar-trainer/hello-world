import { Component } from '@angular/core';
import { Product } from './product.model';

@Component({
  selector: 'products',
  templateUrl: './products.component.html'
})
export class ProductsComponent {
  products: Product[] = [
    <Product>{ id: 1, name: 'Twix', description: 'Left or Right?', price: 10.99 },
    <Product>{ id: 2, name: 'Snickers', description: 'Peanuts & Caramel', price: 1.99 },
    <Product>{ id: 3, name: 'M&Ms', description: 'Melt in your mouth', price: 0.99 },
    <Product>{ id: 4, name: 'Gum', description: 'For Chewing & Bubbles', price: 4.99 }
  ];
  selectedProduct: Product;

  selectedProductHandler(productId: number) {
    this.selectedProduct = Object.assign({}, this.products.find((product: Product) => product.id === productId));
  }

  newProductHandler() {
    this.selectedProduct = <Product>{};
  }

  saveProductHandler(product: Product) {
    // Validate the fields are not empty
    if (!product.name || !product.description || !product.price) {
      return;
    }

    if (!product.id) {
      // Add a new product
      product.id = this.products.length + 1;
      this.products = this.products.concat(product);
    } else {
      // Update current product
      const foundIndex = this.products.findIndex((item: Product) => item.id === product.id);
      this.products[foundIndex] = Object.assign({}, product);
    }

    this.selectedProduct = null;
  }
}
