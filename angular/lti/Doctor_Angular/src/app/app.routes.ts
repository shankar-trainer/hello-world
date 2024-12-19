import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { DoctorComponent } from './component/doctor/doctor.component';
import { AddDoctorComponent } from './component/add-doctor/add-doctor.component';
import { AddPatientComponent } from './component/add-patient/add-patient.component';

export const routes: Routes = [
     {path:'',component:DoctorComponent},
     {path:'all-doctor',component:DoctorComponent},
     {path:'add-doctor',component:AddDoctorComponent},
     {path:'add-patient',component:AddPatientComponent},
    
];
