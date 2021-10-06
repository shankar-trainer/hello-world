import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import { Router } from '@angular/router';
import {Admin} from './admin';

@Injectable({
  providedIn: 'root'
})
export class  AdminService {
  private baseUrl="http://localhost:9090/admin/getAdmin";

  constructor(private http:HttpClient,private router:Router ) { }

  getAdminList(): Observable<any>{
    console.log('Get Admin list called!!')
    return this.http.get(`${this.baseUrl}`);
  }

  addAdmin(admin:object): Observable<Object>{
    console.log('Add admin called! '+admin)
    console.log( 'add admin service called --'+this.http.post(`${this.baseUrl}/`,admin))
    return this.http.post(`${this.baseUrl}/`,admin);
  }

  deleteAdmin(id:number): Observable<any>{
    console.log('Delete  Admin called!')
    return this.http.delete(`${this.baseUrl}/${id}`,{responseType:'text'});
  }
  searchAdmin(id:number): Observable<any>{
    console.log('Search Admin called!')
    return this.http.get(`${this.baseUrl}/${id}`);
  }
  updateAdmin(admin: Object): Observable<Object>{
    console.log('Update Admin called!')
    return this.http.put(`${this.baseUrl}/`,admin);
  }
  adminLogin(id:number, password:string): Observable<any>{
    if(this.searchAdmin(id))
    this.router.navigate(['/admin'])
    return //this.http.request(`${this.baseUrl}/login`);
  }
}
