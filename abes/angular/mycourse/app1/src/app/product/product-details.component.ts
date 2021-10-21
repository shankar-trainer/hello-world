import { Component, Input, Output, EventEmitter, ChangeDetectionStrategy } from '@angular/core';
import { Product } from './product.model';

@Component({
  selector: 'product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class ProductDetailsComponent {
  @Input() item: Product;
  @Output() onSaveClick: EventEmitter<Product> = new EventEmitter<Product>();
  @Output() onCancelClick: EventEmitter<void> = new EventEmitter<void>();
}
