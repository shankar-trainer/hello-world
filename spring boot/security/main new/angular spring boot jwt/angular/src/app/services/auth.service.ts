// auth.service.ts
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, tap } from 'rxjs';
import { User } from '../models/user';
import { TokenResponse } from '../models/token-response';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private apiUrl = 'http://localhost:8080/api/auth';
  private tokenKey = 'jwt-token';

  constructor(private http: HttpClient) { }

  // Login
  login(user: User): Observable<TokenResponse> {
    return this.http.post<TokenResponse>(`${this.apiUrl}/login`, user).pipe(
      tap(response => this.setToken(response.token))
    );
  }

  // Registro
  register(user: User): Observable<any> {
    return this.http.post<any>(`${this.apiUrl}/register`, user);
  }

  // Salva token no localStorage
  setToken(token: string): void {
    localStorage.setItem(this.tokenKey, token);
  }

  // Pega token
  getToken(): string | null {
    return localStorage.getItem(this.tokenKey);
  }

  // Remove token (logout)
  logout(): void {
    localStorage.removeItem(this.tokenKey);
  }

  // Verifica se está logado
  isLoggedIn(): boolean {
    return !!this.getToken();
  }

  // Pega informações do usuário a partir do token
  getUser(): any {
    const token = this.getToken();
    if (!token) return null;

    try {
      const payloadBase64 = token.split('.')[1]; // pega payload do JWT
      const payloadJson = atob(payloadBase64);  // decodifica Base64
      const payload = JSON.parse(payloadJson); // converte para objeto
      return payload; // aqui terá username, roles, etc.
    } catch (err) {
      console.error('Erro ao decodificar token', err);
      return null;
    }
  }

  // Headers para chamadas protegidas
getAuthHeaders(): HttpHeaders {
  const token = this.getToken();
  return new HttpHeaders({
    Authorization: token ? `Bearer ${token}` : ''
  });
}
}
