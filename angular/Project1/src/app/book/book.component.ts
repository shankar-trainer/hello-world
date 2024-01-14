import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { Book } from './model/book';

@Component({
  selector: 'app-book',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule, FormsModule],
  templateUrl: './book.component.html',
  styleUrl: './book.component.css'
})

export class BookComponent {
  @Input() book: Book;

  isbnControl: FormControl;
  bnameControl: FormControl;
  costControl: FormControl;
  categoryControl: FormControl;

  bookFormGroup: FormGroup;

  constructor(private builder: FormBuilder) {
    this.book = new Book();
    this.isbnControl = new FormControl('', [Validators.required,Validators.minLength(5),Validators.maxLength(7)])
    this.bnameControl = new FormControl('', [Validators.required,Validators.minLength(5),Validators.maxLength(20)])
    this.costControl = new FormControl('', [Validators.required,Validators.minLength(2),Validators.maxLength(5)])
    this.categoryControl = new FormControl('', [Validators.required,Validators.minLength(5),Validators.maxLength(15)])
    this.bookFormGroup = this.builder.group({
      isbnControl:this.isbnControl,
      bnameControl:this.bnameControl,
      costControl:this.costControl,
      categoryControl: this.categoryControl
    })
  }
}
