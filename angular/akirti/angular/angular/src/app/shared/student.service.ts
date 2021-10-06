import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Student } from './Student';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http: HttpClient) { }
  baseUrl: string = 'http://localhost:7070/Student';

  getStudent(){
    
    //const obj={this.http.get<Student[]>(this.baseUrl + '/' + 'AllStudents')} 
    return this.http.get<Student[]>(this.baseUrl + '/' + 'AllStudents');
  }

  deleteStudent(studentId: number) {
    return this.http.delete(this.baseUrl + '/'  + 'deleteStudent' + '/' + studentId ,{responseType:'text'});
  }
  
  getStudentById(studentId: number) {
    return this.http.get<Student>(this.baseUrl + '/' +'findStudentById'+'/' + studentId);
  }

  update(std:Student):Observable<any> {
    //let httpHeaders = new HttpHeaders().set('Content-Type','application/json');
    let httpHeaders = new HttpHeaders();
    httpHeaders = httpHeaders.append("Content-Type", "application/json");
   // var body = JSON.stringify(studentEditForm);
    // const url = `${this.saveManageBrokerUrl}` + id + "/";
    const url = this.baseUrl + '/' +'updateStudent'
    
    return this.http.put(url, std);
  }

  
}
