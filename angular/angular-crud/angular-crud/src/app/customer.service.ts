import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer1 } from './addcustomer/model/customer1';
import { Customer } from './allcustomer/model/customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http:HttpClient) {

   }

   getAllCustomer():Observable<any>{
    return this.http.get("http://localhost:8080/customer");
   }

 addCustomer(c:Customer1):Observable<Customer1>{
    return <Observable<Customer1>>  this.http.post("http://localhost:8080/customer",c );
  }
 
  deleteCustomerById(id:number):Observable<any>{
   return  this.http.delete(`http://localhost:8080/customer/${id}`)
  }
  
  searchCustomerById(id:number):Observable<any>{
    console.log("service serchby id",id);
  return  this.http.get(`http://localhost:8080/customer/${id}`)
  //  return <Observable<Customer>> this.http.get(`http://localhost:8080/customer/${id}`)
  }

  

}
