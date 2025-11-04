import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { AuthService } from '../../services/auth.service';
import { UsuarioService } from '../../services/usuario.service';
import { CommonModule } from '@angular/common';

interface Usuario {
  id?: number;
  username: string;
  password?: string;
  roles: string[];
  ocorrenciasCount?: number;
}

@Component({
  selector: 'app-admin-usuarios',
  templateUrl: './admin-usuarios.component.html',
  imports: [CommonModule, ReactiveFormsModule, RouterModule],
  styleUrls: ['./admin-usuarios.component.scss']
})
export class AdminUsuariosComponent implements OnInit {
  usuarios: Usuario[] = [];
  isLoading = true;
  errorMessage = '';

  formUsuario!: FormGroup;
  showFormModal = false;
  editMode = false;
  currentEditId?: number;

  constructor(
    private usuarioService: UsuarioService,
    private fb: FormBuilder,
    private authService: AuthService,
    private router: Router
  ) {}

ngOnInit() {
  this.checkAdmin();
  this.initForm();
  this.loadUsuarios();
}

  // Inicializa o formulário
  initForm() {
    this.formUsuario = this.fb.group({
      username: ['', Validators.required],
      password: [''], // senha opcional na edição
      roles: [[], Validators.required]
    });
  }

  // Checa se o usuário logado é admin
checkAdmin() {
  const user = this.authService.getUser();
  const roles = user?.roles?.map((r: any) => r.authority) || [];
  if (!roles.includes('ROLE_ADMIN')) {
    alert("Você não tem premissão para acessar essa página!")
    this.router.navigate(['/dashboard']);
  }
}

  // Carrega todos os usuários
  loadUsuarios() {
  this.isLoading = true;
  this.usuarioService.listarTodos().subscribe({
    next: (data) => {
      this.usuarios = data.map(u => ({
        id: u.id,
        username: u.username,
        roles: u.roles || [],
        ocorrenciasCount: u.ocorrenciasCount || 0
      }));
      this.isLoading = false;
      this.errorMessage = '';
    },
    error: (err) => {
      console.error('Erro ao carregar usuários', err);
      this.errorMessage = 'Erro ao carregar usuários';
      this.isLoading = false;
    }
  });
}

  // Abre modal para criar usuário
  openForm() {
    this.showFormModal = true;
    this.editMode = false;
    this.formUsuario.reset({ roles: [] });
  }

  // Abre modal para editar usuário
  editUsuario(u: Usuario) {
    this.editMode = true;
    this.currentEditId = u.id;
    this.formUsuario.patchValue({
      username: u.username,
      roles: u.roles.map(r => r.replace('ROLE_', '')) // remove ROLE_ para selecionar na UI
    });
    this.showFormModal = true;
  }

  // Deleta usuário
  deleteUsuario(id?: number) {
    if (!id) return;
    this.usuarioService.deletar(id).subscribe({
      next: () => this.loadUsuarios(),
      error: () => this.errorMessage = 'Erro ao deletar usuário'
    });
  }

  // Salva usuário (criação ou edição)
salvarUsuario() {
  if (this.formUsuario.invalid) return;

  const formValue = this.formUsuario.value;

  // Ajuste para não duplicar ROLE_
  const roles = formValue.roles.map((r: string) =>
    r.startsWith('ROLE_') ? r : `ROLE_${r}`
  );

  const usuario: any = {
    username: formValue.username,
    roles: roles
  };

  if (this.editMode && this.currentEditId) {
    // Se a senha foi preenchida na edição, envia
    if (formValue.password) {
      usuario.password = formValue.password;
    }

    this.usuarioService.atualizar(this.currentEditId, usuario).subscribe({
      next: (res: string) => {
        console.log(res); // "Usuário atualizado com sucesso"
        this.loadUsuarios();
        this.showFormModal = false;
        this.errorMessage = ''; // limpa mensagens de erro
      },
      error: (err: any) => {
        console.error(err);
        this.errorMessage = err.message || 'Erro ao atualizar usuário';
      }
    });
  } else {
    // Criação: senha obrigatória
    if (!formValue.password) {
      this.errorMessage = 'Senha é obrigatória para criar usuário';
      return;
    }
    usuario.password = formValue.password;

    this.usuarioService.criar(usuario).subscribe({
      next: (res: string) => {
        console.log(res); // "Usuário criado com sucesso"
        this.loadUsuarios();
        this.showFormModal = false;
        this.errorMessage = '';
      },
      error: (err: any) => {
        console.error(err);
        this.errorMessage = err.message || 'Erro ao criar usuário';
      }
    });
  }
}

  // Logout
  logout(): void {
    this.authService.logout();
    this.router.navigate(['/login']);
  }
}
