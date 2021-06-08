import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ProductComponent } from '../product/product.component';
import { Product } from './product';
import { ProductService } from './product.service';

@Component({
  selector: 'app-myproduct',
  templateUrl: './myproduct.component.html',
  styleUrls: ['./myproduct.component.css']
})
export class MyproductComponent implements OnInit {
 prdList:Observable<Product[]>;
 
  constructor(private service:ProductService) { 
   this.prdList=service.getAll();
  }

  ngOnInit(): void {
  }

}
