import { Component } from '@angular/core';
import { Product } from '../model/product';
import { ProductService } from '../service/product.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-showall',
  templateUrl: './showall.component.html',
  styleUrls: ['./showall.component.css']
})
export class ShowallComponent {

  prd: Observable<Product[]>;

  constructor(private service: ProductService) {
    this.prd = service.getAllProduct();
  }


}
