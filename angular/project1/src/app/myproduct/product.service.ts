import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Product } from '../product/product';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient, private router: Router) {
   }

   getAll():Observable<any>{
     return this.http.get('http://localhost:9090/product/all');
   }

   
  searchProduct(id:number):Observable<any>{
    return this.http.get<Product>('http://localhost:9090/product/search/'+id);
     }

   

/*   searchProduct(id:number):Observable<Product>{
     return this.http.get<Product>('http://localhost:9090/product/search/'+id);
   }
*/
}
