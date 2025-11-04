import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { OcorrenciaService } from '../../services/ocorrencia';
import { Ocorrencia } from '../../models/ocorrencia';
import { ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { AuthService } from '../../services/auth.service'; // importa o AuthService
import { Router, RouterModule } from '@angular/router';                  // importa o Router

@Component({
  selector: 'app-ocorrencia-list',
  imports: [
    ReactiveFormsModule, CommonModule, RouterModule
  ],
  templateUrl: './ocorrencia-list.component.html',
  styleUrls: ['./ocorrencia-list.component.scss']
})
export class OcorrenciaListComponent implements OnInit {
  ocorrencias: Ocorrencia[] = [];
  isLoading = true;
  errorMessage = '';
  
  formOcorrencia!: FormGroup;

  showFormModal: boolean = false; // para mostrar/ocultar modal
  editMode: boolean = false;
  currentEditId?: number;

  constructor(
    private ocorrenciaService: OcorrenciaService,
    private fb: FormBuilder,
    private authService: AuthService, // injetado aqui
    private router: Router            // injetado aqui
  ) {}

  ngOnInit(): void {
    this.loadOcorrencias();

    // inicializa o form
    this.formOcorrencia = this.fb.group({
      titulo: ['', Validators.required],
      descricao: ['', Validators.required],
      data: [new Date(), Validators.required]
    });
  }

  openForm() {
    this.showFormModal = true;
  }

  closeForm() {
    this.showFormModal = false;
  }

  loadOcorrencias() {
    this.isLoading = true;
    this.ocorrenciaService.listarTodas().subscribe({
      next: (data) => {
        this.ocorrencias = data;
        this.isLoading = false;
      },
      error: () => {
        this.errorMessage = 'Erro ao carregar ocorrências';
        this.isLoading = false;
      }
    });
  }

  editOcorrencia(o: Ocorrencia) {
    this.editMode = true;
    this.currentEditId = o.id;
    this.formOcorrencia.patchValue({
      titulo: o.titulo,
      descricao: o.descricao,
      data: o.data
    });
    this.showFormModal = true;
  }

  logout(): void {
    this.authService.logout();
    this.router.navigate(['/login']);
  }

  deleteOcorrencia(id: number) {
    this.ocorrenciaService.deletar(id).subscribe({
      next: () => this.loadOcorrencias(),
      error: () => this.errorMessage = 'Erro ao deletar ocorrência'
    });
  }

  salvarOcorrencia() {
    if (this.formOcorrencia.invalid) return;

    const formValue = this.formOcorrencia.value;
    const ocorrencia = {
      ...formValue,
      data: formValue.data.slice(0, 16) + ':00' // garante o formato "HH:mm:ss"
    };

    if (this.editMode && this.currentEditId) {
      this.ocorrenciaService.atualizar(this.currentEditId, ocorrencia).subscribe({
        next: (res) => {
          console.log('Ocorrência atualizada:', res);
          this.loadOcorrencias();
          this.showFormModal = false;
          this.editMode = false;
        },
        error: (err) => console.error('Erro ao atualizar ocorrência:', err)
      });
    } else {
      this.ocorrenciaService.criar(ocorrencia).subscribe({
        next: (res) => {
          console.log('Ocorrência criada:', res);
          this.loadOcorrencias();
          this.showFormModal = false;
        },
        error: (err) => console.error('Erro ao criar ocorrência:', err)
      });
    }
  }
}
