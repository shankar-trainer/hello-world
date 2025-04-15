import { Component } from '@angular/core';
import { Book } from '../model/Book';
import { Observable } from 'rxjs';
import { BookService } from '../service/book.service';

@Component({
  selector: 'app-get-all-book',
  templateUrl: './get-all-book.component.html',
  styleUrls: ['./get-all-book.component.css']
})
export class GetAllBookComponent {

  book: Observable<Book[]>;

  constructor(private service: BookService) {
    this.book = service.getAllBook();
  }
}
