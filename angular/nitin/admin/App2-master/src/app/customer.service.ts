import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable, from} from 'rxjs';
import { Router } from '@angular/router';


@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private baseUrl="http://localhost:9090/usr/getUser";

  constructor(private http:HttpClient,private router:Router ) { }

  getCustomerList(): Observable<any>{
    console.log('Get Customer list called!!')
    return this.http.get(`${this.baseUrl}`);
  }

  addCustomer(customer:object): Observable<Object>{
    console.log('Add Customer called!')
    return this.http.post(`${this.baseUrl}/`,customer);
  }

  deleteCustomer(id:number): Observable<any>{
    console.log('Delete  Customer called!')
    return this.http.delete(`${this.baseUrl}/${id}`,{responseType:'text'});
  }
  searchCustomer(id:number): Observable<any>{
    console.log('Search Customer called!')
    return this.http.get(`${this.baseUrl}/${id}`);
  }
  updateCustomer(customer: Object): Observable<Object>{
    console.log('Update customer called!')
    return this.http.put(`${this.baseUrl}/`,customer);
  }
  customerLogin(id:number, password:string): Observable<any>{
    if(this.searchCustomer(id))
    this.router.navigate(['/customer'])
    return //this.http.request(`${this.baseUrl}/login`);
  }
}
