import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Book } from './model/book';
import { BookService } from './service/book.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-crud',
  imports: [CommonModule,FormsModule],
  templateUrl: './crud.component.html',
  styleUrl: './crud.component.css'
})
export class CrudComponent {

  book: Observable<Book[]>;

  constructor(private service:BookService){
      this.book=service.getallbook();
  }


}
