import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MyappointmentService {
  private allUrl="http://localhost:9090/appoint/allAppointments";
  private saveUrl="http://localhost:9090/appoint/addAppointment";
  private updateUrl="http://localhost:9090/appoint/updateAppointment";
  private deleteUrl="http://localhost:9090/appoint/deleteAppointment";
  private searchUrl="http://localhost:9090/appoint/searchAppointment";
  constructor(private http:HttpClient) { }

  getAppointmentList():Observable<any>{
    return this.http.get(`${this.allUrl}`)
  }
  searchAppointment(id: Number):Observable<any>{
    return this.http.get(`${this.searchUrl}/${id}`)
  }
  saveAppointment(appointment: Object):Observable<Object>{
    return this.http.post(`${this.saveUrl}/`,appointment)
  }
  updateAppointment(appointment: Object):Observable<Object>{
    return this.http.put(`${this.updateUrl}/`,appointment)
  }
  removeAppointment(id: Number):Observable<any>{
    return this.http.delete(`${this.deleteUrl}/${id}`,{responseType:'text'})
  }
}
