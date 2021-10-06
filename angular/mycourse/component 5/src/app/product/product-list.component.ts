import { Component, Input, Output, EventEmitter, ChangeDetectionStrategy } from '@angular/core';
import { Product } from './product.model';

@Component({
  selector: 'product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class ProductListComponent {
  @Input() products: Array<Product>;
  @Output() onSelected: EventEmitter<number> = new EventEmitter<number>();
  @Output() onNewClick: EventEmitter<void> = new EventEmitter<void>();

  trackByProducts(index: number, product: Product): number {
    return product.id;
  }
}
