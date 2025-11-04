import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { AuthService } from '../../services/auth.service';
import { Router, RouterModule } from '@angular/router';

@Component({
  selector: 'app-register',
  standalone: true,
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss'],
  imports: [CommonModule, FormsModule, RouterModule],
  providers: [AuthService]
})
export class RegisterComponent {
  // Objeto usado no formulário
  registerData = {
    fullname: '',
    username: '',
    email: '',
    password: '',
    confirmPassword: ''
  };

  registerError = '';

  constructor(private authService: AuthService, private router: Router) {}

  register() {
    if (this.registerData.password !== this.registerData.confirmPassword) {
      this.registerError = 'As senhas não conferem';
      return;
    }

    // Envia só username e password para o back-end
    const payload = {
      username: this.registerData.username,
      password: this.registerData.password
    };

    this.authService.register(payload).subscribe({
      next: () => {
        alert('Usuário registrado com sucesso! Faça login.');
        this.router.navigate(['/login']);
      },
      error: (err) => {
        this.registerError = 'Erro ao registrar: ' + err.message;
      }
    });
  }
}
