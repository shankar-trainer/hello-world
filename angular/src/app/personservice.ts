import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Person } from './person-compoment/model/person';

@Injectable({
  providedIn: 'root',
})
export class Personservice {
  constructor(private http: HttpClient) {
  }

  getAllperson(): Observable<any> {
    return this.http.get('http://localhost:9090/person')
  }
  addperson(person:Person):Observable<Person>{
   return <Observable<Person>> 
     this.http.post('http://localhost:9090/person',person) 
  }

}
