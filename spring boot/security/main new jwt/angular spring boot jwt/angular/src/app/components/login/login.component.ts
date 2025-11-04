import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { AuthService } from '../../services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
  standalone: true,
  imports: [CommonModule, FormsModule, RouterModule],
  providers: [AuthService]
})
export class LoginComponent {
  // Dados do login
  credentials = { username: '', password: '' };
  errorMessage = '';

  // Dados do registro
  registerData = { username: '', password: '', confirmPassword: '' };
  registerError = '';

  showRegisterForm = false; // controla se o formulário de registro aparece

  constructor(private authService: AuthService, private router: Router) {}

  // Login
login() {
  this.authService.login(this.credentials).subscribe({
    next: () => {
      const user = this.authService.getUser();

      // Pega as roles/authorities corretas do token
      const roles = user?.authorities?.map((r: any) => r.authority) || [];

      if (roles.includes('ROLE_ADMIN')) {
        this.router.navigate(['/admin/usuarios']);
      } else {
        this.router.navigate(['/dashboard']);
      }
    },
    error: (err) => this.errorMessage = 'Erro ao logar: ' + err.message
  });
}

  // Registro
  register() {
    this.registerError = ''; // limpa erro antigo
    if (this.registerData.password !== this.registerData.confirmPassword) {
      this.registerError = 'As senhas não conferem';
      return;
    }

    this.authService.register(this.registerData).subscribe({
      next: () => {
        alert('Usuário registrado com sucesso! Faça login.');
        this.registerData = { username: '', password: '', confirmPassword: '' };
        this.showRegisterForm = false; // fecha formulário de registro
      },
      error: (err) => {
        this.registerError = 'Erro ao registrar: ' + (err.error?.message || err.message);
      }
    });
  }

  toggleRegister() {
    this.showRegisterForm = !this.showRegisterForm;
    this.registerError = '';
  }
}