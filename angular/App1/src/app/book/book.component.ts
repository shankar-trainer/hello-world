import { Component } from '@angular/core';
import { Book } from './model/book';
import { BookServiceService } from './service/book.service.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent {

  bk:Book[];

  constructor(private service: BookServiceService) {
    this.bk = service.getBook();
  }

}
