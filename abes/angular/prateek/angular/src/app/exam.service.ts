import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ExamConstants } from './exam-constants';
import { Question } from './question';
import {HttpClient} from '@angular/common/http';
//import {ExamConstants}
@Injectable({
  providedIn: 'root'
})
export class ExamService {
  constructor(private http:HttpClient){}
 public addQuestion(ques:Object):Observable<Object>{
        console.log("in add ques service "+JSON.stringify(ques)
             );
                  return this.http.post("http://localhost:8082/question/addquestion", ques);
}
public viewQuestions():Observable<any>{
       return this.http.get("http://localhost:8082/question/getAllQuestion");
}



}


