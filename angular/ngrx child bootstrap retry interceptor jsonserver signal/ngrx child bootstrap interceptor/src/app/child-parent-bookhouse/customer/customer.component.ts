import { Component, OnInit } from '@angular/core';
import { BookService } from '../book.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-customer',
  imports: [CommonModule,FormsModule],
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  constructor(private bookService: BookService) { }

    status:string='';
    books:Array<any> = [];
    
  ngOnInit(): void {
  
  // Fill the code
  this.display();
    this.bookService.ee.subscribe((msg:string) => {
      this.status = msg;
    });
  }

    display(){
        this.books = this.bookService.getBooks();
    }

}
