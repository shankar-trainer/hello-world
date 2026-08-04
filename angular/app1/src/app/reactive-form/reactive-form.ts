import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-reactive-form',
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './reactive-form.html',
  // styleUrl: './reactive-form.css',
})
export class ReactiveForm {
  formgroup: FormGroup;
  id: FormControl;
  name: FormControl;
  salary: FormControl;

  constructor(private fb: FormBuilder) {
    this.id = new FormControl('', [Validators.required])
    this.name = new FormControl('', [Validators.required,Validators.minLength(5),Validators.maxLength(15)])
    this.salary = new FormControl('', [Validators.required])

    this.formgroup=this.fb.group({
      id:this.id,
      name:this.name,
      salary:this.salary,
    })
  }
  // formValues$: Observable<any> = this.formgroup.valueChanges;

}
