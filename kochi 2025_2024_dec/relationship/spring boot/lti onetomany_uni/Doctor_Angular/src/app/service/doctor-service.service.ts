import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Doctor } from '../model/doctor';
import { Patient } from '../model/patient';

@Injectable({
  providedIn: 'root'
})
export class DoctorServiceService {

  constructor(private http: HttpClient) {
  }

  // getAllDoctor() {
  //   return this.http.get<Doctor[]>("http://localhost:8080/doctor");
  // }

  getAllDoctor():Observable<any> {
    return this.http.get<Doctor[]>("http://localhost:8080/doctor");
  }

  public addDoctor(doctor: Doctor) {
    console.log(doctor+' add doctor service ');
    return this.http.post<Doctor>('http://localhost:8080/doctor' , doctor);
  }

  public addPatient(patient: Patient, did:number) {
   
    console.log(patient+' add doctor service ');
    return this.http.post<Doctor>(`http://localhost:8080/doctor/addPatient/${did}`,patient);
    
    //return this.http.post<Doctor>('http://localhost:8080/doctor/addPatient' , patient,did);
  }


}
