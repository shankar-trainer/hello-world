import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ButtonModule } from 'primeng/button';
import { AuthServiceService } from '../../service/auth-service.service';

@Component({
  selector: 'app-profile',
  standalone: true,
  imports: [
    ButtonModule
  ],
  templateUrl: './profile.component.html',
  styleUrl: './profile.component.css'
})
export class ProfileComponent {
  user = {
    nome: 'Usuário',
    email: 'email@example.com',
    telefone: '556298989898',
    nivelAcesso: 'Usuário'
  };

  constructor(private _router: Router, private _service: AuthServiceService) {
  }

  home(){
    this._router.navigate(['/home']);
  }

  logout(){
    this._service.logout();
  }
}
