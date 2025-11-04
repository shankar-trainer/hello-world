import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ocorrencia } from '../models/ocorrencia';
import { AuthService } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class OcorrenciaService {
  private apiUrl = 'http://localhost:8080/api/ocorrencias'; 

  constructor(private http: HttpClient, private authService: AuthService) { }

  private getAuthHeaders(): HttpHeaders {
    const token = this.authService.getToken();
    return new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${token}` 
    });
  }

  listarTodas(): Observable<Ocorrencia[]> { 
    return this.http.get<Ocorrencia[]>(this.apiUrl, { headers: this.getAuthHeaders() });
  }

  buscarPorId(id: number): Observable<Ocorrencia> { 
    return this.http.get<Ocorrencia>(`${this.apiUrl}/${id}`, { headers: this.getAuthHeaders() });
  }

 criar(ocorrencia: Ocorrencia): Observable<Ocorrencia> {
  return this.http.post<Ocorrencia>(this.apiUrl, ocorrencia, { headers: this.getAuthHeaders() });
}

  atualizar(id: number, ocorrencia: Ocorrencia): Observable<Ocorrencia> { 
    return this.http.put<Ocorrencia>(`${this.apiUrl}/${id}`, ocorrencia, { headers: this.getAuthHeaders() });
  }

  deletar(id: number): Observable<void> { 
    return this.http.delete<void>(`${this.apiUrl}/${id}`, { headers: this.getAuthHeaders() });
  }
}


