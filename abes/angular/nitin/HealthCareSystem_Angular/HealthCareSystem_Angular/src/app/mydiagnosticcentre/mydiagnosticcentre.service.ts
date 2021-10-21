import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class MydiagnosticcentreService {
  private allUrl="http://localhost:9090/diagnosticCentre/allDiagnosticCentres";
  private saveUrl="http://localhost:9090/diagnosticCentre/addDiagnosticCentre";
  private updateUrl="http://localhost:9090/diagnosticCentre/updateDiagnosticCentre";
  private deleteUrl="http://localhost:9090/diagnosticCentre/deleteDiagnosticCentre";
  private searchUrl="http://localhost:9090/diagnosticCentre/searchDiagnosticCentre";
  constructor(private http:HttpClient) {   }
  
   getDiagnosticCentreList():Observable<any>{
    return this.http.get(`${this.allUrl}`)
  }
  searchDiagnosticCentre(id: Number):Observable<any>{
    return this.http.get(`${this.searchUrl}/${id}`)
  }
  saveDiagnosticCentre(diagnosticCentre: Object):Observable<Object>{
    return this.http.post(`${this.saveUrl}/`,diagnosticCentre)
  }
  updateDiagnosticCentre(diagnosticCentre: Object):Observable<Object>{
    return this.http.put(`${this.updateUrl}/`,diagnosticCentre)
  }
  removeDiagnosticCentre(id: Number):Observable<any>{
    return this.http.delete(`${this.deleteUrl}/${id}`,{responseType:'text'})
  }
}
