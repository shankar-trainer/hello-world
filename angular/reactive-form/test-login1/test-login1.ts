import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-test-login1',
  imports: [ReactiveFormsModule,CommonModule],
  templateUrl: './test-login1.html',
  styleUrl: './test-login1.css',
})
export class TestLogin1 {
  
    myForm: FormGroup;

  constructor() {
    this.myForm = new FormGroup({
      firstName: new FormControl('', [Validators.required, Validators.minLength(3)]),
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', [Validators.required, Validators.pattern(/^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/)])
    });
  }

}
