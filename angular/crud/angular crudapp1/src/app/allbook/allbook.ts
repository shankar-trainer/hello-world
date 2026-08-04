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
  b:Observable<Book[]>;
  constructor(private  service:BookService){
    this.b=this.getallbook();
  }
  getallbook(){
    return this.service.getallbook();
  }
}
