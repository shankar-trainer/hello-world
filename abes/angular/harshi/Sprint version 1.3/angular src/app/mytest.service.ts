import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MytestService {
  
  private baseUrl="http://localhost:9090/test/AllTest";
  private baseUrl1="http://localhost:9090/test/deleteTest";
  private baseUrl2="http://localhost:9090/test/addTest";
  private baseUrl4="http://localhost:9090/test/updateTest";
  constructor(private http:HttpClient) { }

  
  searchtest(id:Number):Observable<any>
  {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  saveTest(test:Object):Observable<any>
  {
    console.log("inside service save test ");
    return this.http.post(`${this.baseUrl2}/`,test);
  }

  updateTest(test:Object):Observable<Object>{
    return this.http.put(`${this.baseUrl4}/`,test);
  }

  removeTest(id:Number):Observable<any>{
    return this.http.delete(`${this.baseUrl1}/${id}`,{responseType:'text'});
  }
  
  getTestList():Observable<any>{
    return this.http.get(`http://localhost:9090/test/AllTest`);
  }

}