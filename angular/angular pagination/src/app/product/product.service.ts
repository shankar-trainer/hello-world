import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
      // private baseUrl = 'http://localhost:8080/api/items';
      // private baseUrl = 'http://localhost:8080/products?page=0&size=5&sort=id,asc';
      private baseUrl = 'http://localhost:8080/products';

      constructor(private http: HttpClient) { }

      getItems(page: number, size: number): Observable<any> {
        let params = new HttpParams()
          .set('page', page.toString())
          .set('size', size.toString());
        return this.http.get<any>(this.baseUrl, { params });
      }
}
