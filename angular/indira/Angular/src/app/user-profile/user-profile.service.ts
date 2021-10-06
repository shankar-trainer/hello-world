import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UserProfileService {

  private searchUrl = "http://localhost:9090/wallet/showUser";
  private addUrl = "http://localhost:9090/wallet/addUser";
  private updateUrl = "http://localhost:9090/wallet/updateUser";
  private deleteUrl = "http://localhost:9090/wallet/deleteUser";
  private validLoginUrl = "http://localhost:9090/wallet/validLogin";
  constructor(private httpClient: HttpClient) { }

  searchUser(id: any): Observable<any> {
    return this.httpClient.get(`${this.searchUrl}/${id}`)
  }
  addUser(product: Object): Observable<Object> {
    
    return this.httpClient.post(`${this.addUrl}/`, product);
  }

  updateUser(product: Object): Observable<Object> {
    return this.httpClient.put(`${this.updateUrl}/`, product);
  }

  deleteUser(id: Number): Observable<any> {
    return this.httpClient.delete(`${this.deleteUrl}/${id}`,{responseType:'text'})
  }

  validLogin(loginName:String, password:String):Observable<any> {
    console.log("validLogin called")
   return this.httpClient.get(`${this.validLoginUrl}/${loginName}/${password}`)
  }
}
