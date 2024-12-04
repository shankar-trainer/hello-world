import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class JwtclientService {
  constructor(private httpClient: HttpClient) { }

  public generateToken(request: any) {
   // return this.httpClient.post<string>("http://localhost:8080/api/v1/auth/authenticate", request, {  responseType: 'text' as 'json' });
   // return this.httpClient.post<string>("http://localhost:9192/authenticate", request, {  responseType: 'text' as 'json' });
    //return this.httpClient.post<string>("http://localhost:9192/authenticate", request);
    console.log(request)
    console.log(" post "+JSON.stringify(this.httpClient.post("http://localhost:9192/authenticate", request)))
    return this.httpClient.post("http://localhost:9192/authenticate", request);
    
   
  }
//http://localhost:8086/api/v1/auth/register

  public welcome(token: string) {
    let tokenStr = 'Bearer ' + token;
    const headers = new HttpHeaders().set('Authorization', tokenStr);
    //return this.httpClient.get<string>("http://localhost:8080/", {headers, responseType: 'text' as 'json' });
    //return this.httpClient.get<string>("http://localhost:9192/", {headers, responseType: 'text' as 'json' });
    return this.httpClient.get<string>("http://localhost:9192/", {headers, responseType: 'text' as 'json' });
    //return this.httpClient.get<string>("http://localhost:9192/", {headers});
  }
}
