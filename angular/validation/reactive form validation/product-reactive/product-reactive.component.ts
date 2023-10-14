import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-product-reactive',
  templateUrl: './product-reactive.component.html',
  styleUrls: ['./product-reactive.component.css']
})
export class ProductReactiveComponent {
  productForm: FormGroup;
  id: FormControl;
  name: FormControl;
  cost: FormControl;
  
  constructor(private builder: FormBuilder) { 
    this.id = new FormControl('', [Validators.required]);
    this.name = new FormControl('', [Validators.required,Validators.minLength(5)]);
    this.cost = new FormControl('', [Validators.required]);

    this.productForm = this.builder.group(
      {
        id: this.id,
        name: this.name,
        cost: this.cost
      }
    )
  }

   
}
