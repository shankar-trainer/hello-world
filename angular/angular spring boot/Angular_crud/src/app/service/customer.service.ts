import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../model/customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http:HttpClient) { 

  }

  getAllCustomer():Observable<any>{
   return  this.http.get("http://localhost:8080/customer/all")
  }
  addCustomer(c:Customer):Observable<Object>{
    console.log('customer add called ... ')
    console.log('customer is... '+c)
   return  this.http.post("http://localhost:8080/customer/add",c);
  }

}
