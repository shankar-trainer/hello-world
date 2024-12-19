import { Component, Input } from '@angular/core';
import { Doctor } from '../../model/doctor';
import { Patient } from '../../model/patient';
import { DoctorServiceService } from '../../service/doctor-service.service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-add-doctor',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './add-doctor.component.html',
  styleUrl: './add-doctor.component.css'
})
export class AddDoctorComponent {

  doctor: Doctor;
  @Input() doctor1: Doctor;
  @Input() patient: Patient;
  msg: string = '';
  visible: boolean = false;

  constructor(private service: DoctorServiceService, private route: Router) {
    this.doctor = new Doctor();
    this.doctor1 = new Doctor();
    this.patient = new Patient();
  }
  addRecord() {
    this.visible = true;

    this.service.addDoctor(this.doctor).subscribe(
      data => {
        this.msg = 'Record added',
        this.doctor1=data; 
      }
      , error =>
        this.msg = error.error
    );

  }
}
