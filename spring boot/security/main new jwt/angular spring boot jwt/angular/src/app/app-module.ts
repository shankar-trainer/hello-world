import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms'; // ✅ Adicionado aqui
import { HttpClientModule } from '@angular/common/http'; // ✅ Importante também

import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { OcorrenciaListComponent } from './components/ocorrencia-list/ocorrencia-list.component';
import { RelatorioComponent } from './components/relatorio/relatorio.component';

import { routes } from './app.routes';

@NgModule({
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    FormsModule, // ✅ Agora o ngModel vai funcionar
    ReactiveFormsModule,
    HttpClientModule,
    // ✅ todos os componentes standalone
    LoginComponent,
    AppComponent,
    DashboardComponent,
    OcorrenciaListComponent,
    RelatorioComponent
  ],
})
export class AppModule {}
