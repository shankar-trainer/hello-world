import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http: HttpClient, router: Router) {

  }


  getAllBook(): Observable<any> {

    return this.http.get('http://localhost:3000/books');
  }
  addBook(book: Object): Observable<Object> {
    return this.http.post('http://localhost:3000/books', book);

  }
}
