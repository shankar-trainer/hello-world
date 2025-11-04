import { Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { OcorrenciaListComponent } from './components/ocorrencia-list/ocorrencia-list.component';
import { RegisterComponent } from './components/register/register.component';
import { AdminUsuariosComponent } from './components/admin/admin-usuarios.component';
import { RelatorioComponent } from './components/relatorio/relatorio.component'; // ✅ importa o componente

export const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'admin', component: AdminUsuariosComponent },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'dashboard/ocorrencias', component: OcorrenciaListComponent },

  // ✅ nova rota para o relatório
  { path: 'relatorio', component: RelatorioComponent },

  // redirecionamento padrão
  { path: '**', redirectTo: '' }
];
