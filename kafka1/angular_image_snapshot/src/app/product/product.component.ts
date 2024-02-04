import { Component, Input } from '@angular/core';
import { Product } from './Product';
import { CommonModule } from '@angular/common';
import { Router, RouterLink, RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-product',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterOutlet, RouterLink],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {
  @Input() prd1: Product=new Product();
  
  constructor(private router: Router) {
  }
  search() {
    this.router.navigate(['/searchproduct', this.prd1.id, this.prd1.name, this.prd1.cost])
  }
}
