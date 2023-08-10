import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Router } from "@angular/router";
import { Observable } from "rxjs";

@Injectable(
    { providedIn: 'root' }
)
export class ProductService {

    constructor(private http: HttpClient, private router: Router) {

    }
    getAll(): Observable<any> {
        return this.http.get('http://localhost:9090/product/all');
    }
    saveProduct(product:Object ):Observable<Object>{
        console.log('product add service called ')
        return this.http.post('http://localhost:9090/product/add',product);
        
    }

} 