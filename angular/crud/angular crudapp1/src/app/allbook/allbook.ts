import { Component } from '@angular/core';
import { BookService } from '../service/book';
import { Book } from '../model/book';
import { Observable } from 'rxjs';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-allbook',
  imports: [CommonModule],
  templateUrl: './allbook.html',
  styleUrl: './allbook.css',
})
export class Allbook {
  b!: any;
  msg: string='';
  constructor(private service: BookService) {

    this.service.getallbook().subscribe(data => {
      this.b = data;
      console.log(JSON.stringify(this.b))
    },
      error => {
        this.msg = error.error;
        console.log("msg " + this.msg)
      }
    );
  }

  addBook(b: Book): Observable<Book> {
    return this.service.addbook(b);
  }

}
