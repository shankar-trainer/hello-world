import { HttpClient } from '@angular/common/http';
import { MyProduct } from './myproduct/myproduct';
import { Injectable } from '@angular/core';
import { Observable, of, throwError } from 'rxjs';
import {  HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { catchError, tap, map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class MyproductService {
  private baseUrl = "http://localhost:9090/prd";

  constructor(private http: HttpClient) {
  }

  /*
  getProduct(id: number): Observable<MyProduct> {
    const url = `${this.baseUrl}/${id}`;
    return this.http.get<MyProduct>(url).pipe(
      tap(_ => console.log(`fetched product id=${id}`)),
      catchError(this.handleError<MyProduct>(`getProduct id=${id}`))
    );
  }
*/

  searchProduct(id: Number): Observable<MyProduct> {
    return this.http.get<MyProduct>(`${this.baseUrl}/searchProduct1/${id}`)
  }
  saveProduct(product: Object): Observable<Object> {
    console.log('inside save Product')
    return this.http.post(`${this.baseUrl}/addProduct`, product);
  }

  updateProduct(product: Object): Observable<Object> {
    return this.http.put(`${this.baseUrl}/updateProduct`, product);
  }

  removeProduct(id: Number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/deleteProduct/${id}`,{responseType:'text'})
  }
  
  getProductList(): Observable<any> {
    return this.http.get(`${this.baseUrl}/allProduct`)
  }

  
}
