import { Component } from '@angular/core';
import { UserService } from '../../service/user.service';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { ButtonModule } from 'primeng/button';
import { TableModule } from 'primeng/table';
import { DialogModule } from 'primeng/dialog';
import { FormsModule } from '@angular/forms';
import { MessageService } from 'primeng/api';
import { ToastModule } from 'primeng/toast';
import { User } from '../../models/User';

@Component({
  selector: 'app-user',
  standalone: true,
  imports: [
    RouterModule,
    CommonModule,
    ButtonModule,
    TableModule,
    DialogModule,
    FormsModule,
    ToastModule
  ],
  providers: [MessageService],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent {
  users: User[] = [];
  displayDialogView: boolean = false;
  displayDialogEdit: boolean = false;
  displayErrorDialog: boolean = false;
  errorMessage: string = '';

  // roles: string[] = ["user"];
  // newUser: User = { username: '', password: '', roles: [] };

  constructor(private userService: UserService, private messageService: MessageService) {}

  ngOnInit() {
    this.userService.get().subscribe({
      next: (response) => {
        console.log(response)
        this.users = response;
      }
    });
  }

  // adicionarNovoUser() {
  //   this.userService.adicionarUser(this.newUser).subscribe({
  //     next: (response) => {
  //       this.users.push(response);  // Adiciona o novo usuário à lista de usuários
  //       this.messageService.add({ severity: 'success', summary: 'Sucesso', detail: 'Usuário adicionado com sucesso' });
  //     },
  //     error: (error) => {
  //       this.errorMessage = 'Erro ao adicionar usuário';
  //       this.displayErrorDialog = true;
  //     }
  //   });
  // }
}
