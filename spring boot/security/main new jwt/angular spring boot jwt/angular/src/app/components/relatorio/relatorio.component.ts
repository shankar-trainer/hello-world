import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CommonModule, DatePipe } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { AuthService } from '../../services/auth.service'; // importando seu serviço

@Component({
  selector: 'app-relatorio',
  standalone: true,
  imports: [CommonModule, FormsModule, DatePipe, RouterModule],
  templateUrl: './relatorio.component.html',
  styleUrls: ['./relatorio.component.scss'],
})
export class RelatorioComponent {
  userId: number | null = null;
  relatorio: any = null;
  carregando = false;
  erro: string | null = null;

  private apiUrl = 'http://localhost:8080/api/relatorios/ocorrencias';

  constructor(private http: HttpClient, private authService: AuthService) {}

  gerarRelatorio(): void {
    if (!this.userId) {
      this.erro = 'Por favor, informe o ID do usuário.';
      return;
    }

    const token = this.authService.getToken(); // pegar o token do AuthService
    if (!token) {
      this.erro = 'Usuário não autenticado.';
      return;
    }

    this.erro = null;
    this.relatorio = null;
    this.carregando = true;

    this.http.get(`${this.apiUrl}/${this.userId}`, {
  headers: this.authService.getAuthHeaders()
}).subscribe({
  next: (data) => {
    this.relatorio = data;
    this.carregando = false;
  },
  error: (err) => {
    this.carregando = false;
    this.erro = err.error?.message || 'Erro ao gerar relatório.';
  }
});
  }
}
