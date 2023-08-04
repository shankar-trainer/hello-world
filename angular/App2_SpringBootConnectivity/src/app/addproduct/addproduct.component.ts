import { Component, Input } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../service/product.service';
import { Product } from './product';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent {
 @Input() prd: Product;
  constructor(private service: ProductService, private router: Router) {
    this.prd = new Product();
  }
  addProduct() {
      this.service.saveProduct(this.prd).subscribe();
      alert('product added')
  }
}
