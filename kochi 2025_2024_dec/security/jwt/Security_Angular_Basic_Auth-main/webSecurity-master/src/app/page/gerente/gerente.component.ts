import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-gerente',
  templateUrl: './gerente.component.html',
  styleUrls: ['./gerente.component.css']
})
export class GerenteComponent implements OnInit {
  users: any[] = [];

  constructor() { }

  ngOnInit() {
    this.loadUsers();
  }

  loadUsers() {
    this.users = [
      { nome: 'Usuário 1', email: 'user@example.com', telefone: '(62) 1234-5678', nivelAcesso: 'Gerente' },
      { nome: 'Usuário 2', email: 'user@example.com', telefone: '(62) 9876-5432', nivelAcesso: 'Admin' },
      { nome: 'Usuário 3', email: 'user@example.com', telefone: '(62) 9999-1234', nivelAcesso: 'Usuário' }
    ];
  }
}
