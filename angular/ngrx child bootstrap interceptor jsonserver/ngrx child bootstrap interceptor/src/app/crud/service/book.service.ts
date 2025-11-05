import {HttpClient, HttpErrorResponse} from '@angular/common/http';
import { Injectable } from '@angular/core';
import {catchError, Observable, retry, throwError} from 'rxjs';
import { Book } from '../model/book';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http: HttpClient) { }

    getallbook1(): Observable<any> {
        //  return this.http.get<Book[]>("http://localhost:3000/books")
        return this.http.get<Book[]>("http://localhost:7070/Book").pipe(
            retry(3), // Retry the request up to 3 times
            catchError((error: HttpErrorResponse) => {
                console.error(error + " retry error ......");
                return throwError(error);
            })
        );
    }

  getallbook(): Observable<any> {
    //  return this.http.get<Book[]>("http://localhost:3000/books")
    return this.http.get<Book[]>("http://localhost:7070/Book")
  }

  addbook(b: Book): Observable<Book> {
    console.log(JSON.stringify(b) + " added ")
    // return this.http.post<Book>("http://localhost:3000/books",b)
    return this.http.post<Book>("http://localhost:7070/Book", b)
  }

}
