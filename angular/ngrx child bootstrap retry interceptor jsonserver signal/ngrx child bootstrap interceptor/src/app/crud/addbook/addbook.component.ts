import { Component, Input } from '@angular/core';
import { Book } from '../model/book';
import { FormsModule } from "@angular/forms";
import { BookService } from '../service/book.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-addbook',
  imports: [FormsModule, CommonModule],
  templateUrl: './addbook.component.html',
  styleUrl: './addbook.component.css'
})
export class AddbookComponent {
  @Input() book: Book = new Book();
  @Input() book1: Book = new Book();
  msg: string = ''
  constructor(private service: BookService) {

  }

  addBook() {
    // this.service.addbook(this.book).subscribe();

    this.service.addbook(this.book).subscribe((data) => {
      this.book1 = data;
      this.msg = 'book added'
    },
      (error) => {
        console.log(JSON.stringify(error))
        this.msg = error.error
      }
    )
  }
}
