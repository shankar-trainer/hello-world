import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class UtilService {
  private url = "http://localhost:8080"

  constructor(private http: HttpClient) { }

  dashboard(): Observable<string>{
    const token = localStorage.getItem('token');
    const headers = new HttpHeaders({
      Authorization: 'Basic ' + token
    });

    return this.http.get(this.url + "/api", {headers, responseType: "text"});
  }

  adm(){
    const token = JSON.parse(localStorage.getItem('token') || '');
    const headers = new HttpHeaders({
      Authorization: 'Basic ' + token
    });

    this.http.get(this.url + "/api/adm", {headers});
  }

  user(){
    const token = JSON.parse(localStorage.getItem('token') || '');
    const headers = new HttpHeaders({
      Authorization: 'Basic ' + token
    });

    this.http.get(this.url + "/api/user", {headers});
  }

  profile(){
    const token = JSON.parse(localStorage.getItem('token') || '');
    const headers = new HttpHeaders({
      Authorization: 'Basic ' + token
    });

    this.http.get(this.url + "/api/profile", {headers});
  }
}
