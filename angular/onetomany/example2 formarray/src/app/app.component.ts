import { RouterOutlet } from '@angular/router';
import { Component } from '@angular/core';
import { FormArray, FormBuilder, FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CommonModule, JsonPipe } from '@angular/common';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,FormsModule,ReactiveFormsModule,CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  title = 'angular-formarray-example';

  form:FormGroup;

  constructor(private fb:FormBuilder){
//    this.formInit();
this.form = this.fb.group({
  skills: this.fb.array([
    // this.fb.group({
    //   name:['JavaScript'],
    //   checked:[true]
    // }),
    // this.fb.group({
    //   name:['Angular'],
    //   checked:[false]
    // }),
    // this.fb.group({
    //   name:['React Js'],
    //   checked:[true]
    // }),

    this.fb.group({
      bookName: [''],
          price: ['']
 
    }),
    this.fb.group({
      bookName: [''],
      price: ['']

    })
  ])
})

console.log(this.form.getRawValue());

  }

  formInit(){
    }


  public get skills(){
    return this.form.get('skills') as FormArray;
  }


}
