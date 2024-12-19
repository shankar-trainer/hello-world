import { Component, Input } from '@angular/core';
import { Doctor } from '../../model/doctor';
import { Patient } from '../../model/patient';
import { DoctorServiceService } from '../../service/doctor-service.service';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-add-patient',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './add-patient.component.html',
  styleUrl: './add-patient.component.css'
})
export class AddPatientComponent {

  doctorId: number = 0;

  patient: Patient;
  @Input() patient1: Patient;
  msg: string = '';
  visible: boolean = false;

  constructor(private service: DoctorServiceService, private route: Router) {
    this.patient = new Patient();
    this.patient1 = new Patient();
  }
  addRecord() {
    this.visible = true;

    this.service.addPatient(this.patient,this.doctorId).subscribe(
      data => {
        this.msg = 'Record added'
        //console.log(data); 
        console.log(JSON.stringify(data)+'  patient data added'); 
        //this.patient1 = data;
      }
      , error =>
        this.msg = error.error
    );
  }
}
