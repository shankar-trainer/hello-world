import { Component } from '@angular/core';
import { bdata } from './data/book_data';
import { BookModel } from './model/book';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-book',
  imports: [CommonModule],
  templateUrl: './book.html',
  styleUrl: './book.css',
})
export class Book {
  book: BookModel[];
  img_src: string;
  img_src1: string;
  img_width: number;
  img_height: number;


  constructor() {
    this.img_src = "img2.jpg";
    this.img_src1 = "img3.jpg";
    this.img_width = 300;
    this.img_height = 200;
    this.book = bdata;
  }

}
