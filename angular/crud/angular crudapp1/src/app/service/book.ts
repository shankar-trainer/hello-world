import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Book } from '../model/book';

@Injectable({
  providedIn: 'root',
})
export class BookService {

  constructor(private http: HttpClient) { }
     getallbook(): Observable<any> {
       return this.http.get("http://localhost:9090/book");
    }

    addbook(b:Book):Observable<Book>{
      return this.http.post<Book>("http://localhost:9090/book",b);

    }

}
