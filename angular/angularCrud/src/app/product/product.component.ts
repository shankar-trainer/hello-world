import { Component, OnInit } from '@angular/core';
import { ProductService } from './product.service';
import {Observable} from 'rxjs';
import { Product } from './product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  prd:Observable<Product[]>;
  
  constructor(private service:ProductService) {
    this.prd=service.getProductList();
   }

  ngOnInit(): void {
  }

}
