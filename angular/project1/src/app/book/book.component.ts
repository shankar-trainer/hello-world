import { Component, OnInit } from '@angular/core';
import { Book } from './book';
import { BookService } from './book.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {
  b1:Book[];

  constructor(private service:BookService) {
    this.b1=service.getBooks();
   }

  ngOnInit(): void {
  }

}
