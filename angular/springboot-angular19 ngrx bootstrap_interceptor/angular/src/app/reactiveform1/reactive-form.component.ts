import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Product } from './model/product';

@Component({
  selector: 'app-reactive-form1',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule, FormsModule],
  templateUrl: './reactive-form.component.html',
    
})
export class ReactiveFormComponent1 {

  productForm: FormGroup;
  id: FormControl;
  name: FormControl;
  cost: FormControl;
  prd1:Product;


  constructor(private builder: FormBuilder) {
    this.prd1=new Product();
    this.id = new FormControl('', [Validators.required]);
    this.name = new FormControl('', [Validators.required, Validators.minLength(5)]);
    this.cost = new FormControl('', [Validators.required]);

    this.productForm = this.builder.group(
      {
        id1: this.id,
        name1: this.name,
        cost1: this.cost
      }
    )
  }

}
