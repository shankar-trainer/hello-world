import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { Book } from './model/book';

@Component({
  selector: 'app-reactiveform',
  standalone: true,
  imports: [CommonModule,FormsModule,ReactiveFormsModule],
  templateUrl: './reactiveform.component.html',
  styleUrl: './reactiveform.component.css'
})
export class ReactiveformComponent {
  
  fgroup:FormGroup;

  isbn:FormControl;
  bname:FormControl;
  cost:FormControl;

  constructor(private builder:FormBuilder){
     this.isbn=new FormControl('',[Validators.required,Validators.minLength(5), Validators.maxLength(10)]);
     this.bname=new FormControl('',[Validators.required,Validators.minLength(5), Validators.maxLength(15)]);
     this.cost=new FormControl('',[Validators.required,Validators.minLength(1), Validators.maxLength(7)]);

    this.fgroup=this.builder.group({
      isbn:this.isbn,
      bname:this.bname,
      cost:this.cost,
      })
    }

    @Input() b:Book=new Book();
    visible:boolean=false;

    show(){
      this.visible=true;
  }
}
