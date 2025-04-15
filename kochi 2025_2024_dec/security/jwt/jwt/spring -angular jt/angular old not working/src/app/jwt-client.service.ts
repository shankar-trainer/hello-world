import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class JwtClientService {


  constructor(private httpClient: HttpClient) { }


  public generateToken(request:any) {
  //  return this.httpClient.post<string>("http://localhost:9191/authenticate", request, {  responseType: 'text' as 'json' });
    return this.httpClient.post<string>("http://localhost:8080/products/authenticate", request, {  responseType: 'text' as 'json' });

  }


  public welcome(token:any) {
    let tokenStr = 'Bearer ' + token;
    console.log("Bearer tokes "+tokenStr)
    const headers = new HttpHeaders().set('Authorization', tokenStr);
    console.log("header "+JSON.stringify(headers));
    //return this.httpClient.get<string>("http://localhost:9191/", {headers, responseType: 'text' as 'json' });
    return this.httpClient.get<string>("http://localhost:8080/products/all", {headers, responseType: 'text' as 'json' });
  
  }}
