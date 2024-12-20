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
    console.log(this.patient+"  add patient record"); 
    this.service.addPatient(this.patient,this.doctorId).subscribe(
      data => {
        this.msg = 'Patient Record added'
        //console.log(data); 
        console.log(JSON.stringify(data)+'  patient data added'); 
        //Property 'location' is missing in type 'Doctor' but required in type 'Patient'.ts(2741)
            //patient.ts(5, 5): 'location' is declared here.

       //this.patient1 = data;
       //https://stackoverflow.com/questions/56474226/property-0-is-missing-in-type-any-but-required-in-type-id-string-gp
      }
      , error =>
        this.msg = error.error
    );
  }
}
