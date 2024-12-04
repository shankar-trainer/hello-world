import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
})
export class RestapiService {

    user = { 'username': '', 'password': '' }
    constructor(private http: HttpClient) {

    }

    login(username: string, password: string) {
        this.user.username = username;
        this.user.password = password;

        const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
        return this.http.get("http://localhost:8080/", { headers, responseType: 'text' as 'json' })
    }

    getUsers() {
        const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(this.user.username + ':' + this.user.password) });
        return this.http.get("http://localhost:8080/getUsers", { headers });
    }

    getEmployees() {
        const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(this.user.username + ':' + this.user.password) });
        return this.http.get("http://localhost:8080/allEmployees", { headers });
    }

}
