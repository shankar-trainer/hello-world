import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private httpClient: HttpClient) { }
  getProductList(): Observable<any> {
    return this.httpClient.get("http://localhost:9090/prd/getAll");
  }

  saveProduct(prd:Product):Observable<Object>{
    return this.httpClient.post('http://localhost:9090/prd/addProduct',prd);
  }
  updateProduct(prd:Object):Observable<Object>{
    return this.httpClient.put('http://localhost:9090/prd/updateProduct',prd);
  }

  searchProduct(id:number):Observable<Product>{
    return this.httpClient.get<Product>('http://localhost:9090/prd/search/'+id);
  }
  deleteProduct(id:number):Observable<Product>{
    return this.httpClient.delete<Product>('http://localhost:9090/prd/delete/'+id);
  }

}
