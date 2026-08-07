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
  // b: Observable<Book[]>;
  //1.// b: Observable<any>;
  //2.//
  // b: Book[] = [];
  b!: any;
  msg!: string;
  constructor(private service: BookService) {
    //1.//this.b = this.getallbook();

    this.service.getallbook().subscribe(data => {
      this.b = data;
    },
      error => {
        this.msg = error.error;
        console.log("msg "+this.msg)
      }
    );
  }


  addBook(b: Book): Observable<Book> {
    return this.service.addbook(b);
  }

}
