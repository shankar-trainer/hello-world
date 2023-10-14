import { Component, Input } from '@angular/core';
import { BookService } from '../service/book.service';
import { Book } from '../model/Book';


@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent {
  @Input() book: Book;
  msg: string = '';

  constructor(private service: BookService) {
    this.book = new Book();
    console.log('constructor book is ' + this.book)
  }

  addBook() {
    // this.service.addBook(this.book).subscribe(data => this.msg = 'record added', error => {
    //   this.msg = error
    //   //console.log("error is " + error.error)
    //   console.log("error is " + error)
    // });

    this.service.addBook(this.book).subscribe();

  }

}
