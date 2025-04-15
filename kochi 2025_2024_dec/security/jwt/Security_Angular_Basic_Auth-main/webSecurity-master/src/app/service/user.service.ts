import { Injectable } from '@angular/core';
import { User } from '../models/User';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private users: User[] = [];
  private url = "http://localhost:8080/user";

  constructor(private httpClient: HttpClient) {}

  get() {
    const token = localStorage.getItem('token');
    const headers = new HttpHeaders({
      Authorization: 'Basic ' + token
    });

    return this.httpClient.get<User[]>(this.url, {headers});
  }

  adicionarUser(user: User): Observable<User> {
    const token = localStorage.getItem('token');
    const headers = new HttpHeaders({
      Authorization: 'Basic ' + token,
      'Content-Type': 'application/json'
    });

    return this.httpClient.post<User>(this.url, user, { headers });
  }

  listarUser(): User[] {
    return this.users;
  }

  obterUser(id: number): User | undefined {
    return this.users.find(user => user.id === id);
  }

  atualizarUser(id: number, user: User) {
    return this.httpClient.put<User>(this.url, user);
  }

  deleteUser(id: number): Observable<void> {
    return this.httpClient.delete<void>(`${this.url}/${id}`);
  }
}

