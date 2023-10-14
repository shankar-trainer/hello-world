import { Component, Input } from '@angular/core';
import { Product } from '../model/product';
import { ProductService } from '../service/product.service';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent {
  @Input() prd: Product;
  msg: string = '';

  constructor(private service: ProductService) {
    this.prd = new Product();

  }
  addproduct() {
    this.service.addproduct(this.prd).subscribe(
      data => this.msg = "record added " + JSON.stringify(data), error => this.msg =  error.error
    )
  }

}
