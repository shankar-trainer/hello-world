import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule,FormsModule],
  templateUrl: './reactive-form.component.html',
  styleUrl: './reactive-form.component.css'
})
export class ReactiveFormComponent {


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
