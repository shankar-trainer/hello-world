import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from "rxjs";
import {Employee} from "../../entities/employee";
import {Address} from "../../entities/address";
@Injectable({
  providedIn: 'root'
})
export class HttpService {
  private readonly EMPLOYEE_REST : string = 'http://localhost:8080/api/employee'; // my base api I build
  private readonly ADDRESS_REST : string = 'http://localhost:8080/api/address'; // my base api I build
  private httpHeaders = new HttpHeaders().set('Content-Type', 'application/json');  // use when send url + arg !!
  private httpClient : HttpClient
  constructor(httpClient : HttpClient) {
    this.httpClient = httpClient;
  }
  readsEmployees() : Observable<Employee[]> {
    // return json text from my rest api
    return this.httpClient.get<Employee[]>(this.EMPLOYEE_REST+`/reads`);
  }
  readEmployee(eid : number) : Observable< any> {
    // return json text from my rest api
    return this.httpClient.get<Employee>(this.EMPLOYEE_REST+`/read/`+eid,{headers : this.httpHeaders});
  }
  readAddress(aid : number) : Observable< any> {
    // return json text from my rest api
    return this.httpClient.get<Address>(this.ADDRESS_REST+`/read/`+aid,{headers : this.httpHeaders});
  }
  updateEmployee(eid : number,employee : Employee) : Observable< any> {
    // return json text from my rest api
    return this.httpClient.put<Employee>(this.EMPLOYEE_REST+`/update/`+eid,employee,{headers : this.httpHeaders});
  }
  updateAddress(address:Address) : Observable< any> {
    // return json text from my rest api
    return this.httpClient.put<Address>(this.ADDRESS_REST+`/update`,address);
  }
  readsEmployeesOnly() : Observable<Employee[]> {
    // return json text from my rest api
    return this.httpClient.get<Employee[]>(this.EMPLOYEE_REST+`/reads/only`);
  }

  deleteEmployee(eid : number) : Observable<any> {
    // should send header
    return this.httpClient.delete(this.EMPLOYEE_REST+`/delete/`+eid, {headers : this.httpHeaders})
  }
  deleteAddress(aid : number) : Observable<any> {
    // should send header
    return this.httpClient.delete(this.ADDRESS_REST+`/delete/`+aid, {headers : this.httpHeaders})
  }

  createEmployee(employee : Employee) : Observable<any> {
    //
    return this.httpClient.post(this.EMPLOYEE_REST+`/create`,employee);
  }

  createAddress(address : Address,eid : number) : Observable<any> {
    //
    return this.httpClient.post(this.ADDRESS_REST+`/create/`+eid,address,{headers : this.httpHeaders});
  }

  readsAddresses() : Observable<Address[]> {
    // return json text from my rest api
    return this.httpClient.get<Address[]>(this.ADDRESS_REST+`/reads`);
  }

}
