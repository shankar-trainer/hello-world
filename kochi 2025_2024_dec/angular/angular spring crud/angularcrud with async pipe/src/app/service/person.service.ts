import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Person } from '../model/Person';

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  constructor(private http: HttpClient) {

  }
  getAllPerson(): Observable<any> {
  return this.http.get("http://localhost:9090/person/all");
  }
  addPerson(p:Person):Observable<Person>{
   return <Observable<Person>>this.http.post("http://localhost:9090/person/add",p);
  }
  searchPerson(id:number):Observable<Person>{
    return <Observable<Person>>this.http.get("http://localhost:9090/person/search/"+id);
  }

  deletePerson(id:number):Observable<Person>{
    return <Observable<Person>>this.http.delete("http://localhost:9090/person/delete/"+id);
  }

  updatePerson(p:Person):Observable<Person>{
    return <Observable<Person>>this.http.put("http://localhost:9090/person/update",p);
  }
}



