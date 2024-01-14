import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ProductService } from '../service/product.service';
import { Product } from '../model/product';

@Component({
  selector: 'app-showallproduct',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './showallproduct.component.html',
  styleUrl: './showallproduct.component.css'
})
export class ShowallproductComponent {
  prd: Observable<Product[]>;

  constructor(private service: ProductService) {
    this.prd = service.getAllProduct();
  }

}
