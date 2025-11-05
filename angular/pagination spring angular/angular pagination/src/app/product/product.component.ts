import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ProductService } from './product.service';

@Component({
  selector: 'app-product',
  imports: [CommonModule,FormsModule],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {

   items: any[] = [];
      currentPage = 0;
      pageSize = 5;
      totalPages = 0;
      totalElements = 0;

      constructor(private pservice: ProductService) { }

      ngOnInit(): void {
        this.loadProducts();
      }

      loadProducts(): void {
        this.pservice.getItems(this.currentPage, this.pageSize).subscribe(data => {
          this.items = data.content;
          this.totalPages = data.totalPages;
          this.totalElements = data.totalElements;
        });
      }

      onPageChange(page: number): void {
        this.currentPage = page;
        this.loadProducts();
      }
}
