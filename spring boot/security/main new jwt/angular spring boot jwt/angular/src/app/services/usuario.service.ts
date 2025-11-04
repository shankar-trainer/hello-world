import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from './auth.service';
import { Observable } from 'rxjs';

interface Usuario {
  id?: number;
  username: string;
  password?: string;
  roles: string[];
  ocorrenciasCount?: number;
}

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  private apiUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient, private authService: AuthService) {}

  listarTodos(): Observable<Usuario[]> {
    return this.http.get<Usuario[]>(`${this.apiUrl}/admin/users`, {
      headers: this.authService.getAuthHeaders()
    });
  }

criar(usuario: Usuario) {
  return this.http.post(`${this.apiUrl}/admin/users`, usuario, {
    headers: this.authService.getAuthHeaders(),
    responseType: 'text' 
  });
}

atualizar(id: number, usuario: Usuario) {
  return this.http.put(`${this.apiUrl}/admin/users/${id}`, usuario, {
    headers: this.authService.getAuthHeaders(),
    responseType: 'text' 
  });
}

  deletar(id: number) {
    return this.http.delete(`${this.apiUrl}/admin/users/${id}`, {
      headers: this.authService.getAuthHeaders()
    });
  }
}
