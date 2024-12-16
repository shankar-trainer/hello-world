import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  url: string = "http://localhost:8090/student"
  constructor(private _http: HttpClient) { }

  public getBooks() {
    console.log("in get method")
    return this._http.get<Student[]>(this.url+'/findall');
  }

  public addStudent(student: Student) {
    console.log(student);
    return this._http.post<Student>(this.url+'/save', student);
  }
}
