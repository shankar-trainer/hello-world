import { Injectable } from '@angular/core';
import {  HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map, catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';
import { ScheduleFlight } from './ScheduleFlight';
import{Schedule} from './Schedule';


@Injectable({
  providedIn: 'root'
})
export class ScheduledFlightService {

  private baseUrl:String = 'http://localhost:8080/api';
  private headers = new Headers({'Content-Type':'application/json'});
  private response:Response;
  private scheduledFlight:ScheduleFlight;
  private scheduleFlight:ScheduleFlight;
  public setId:Number;
  private options = {
    headers: new HttpHeaders().append('Content-Type', 'application/json'),
  }
  
  constructor(private http: HttpClient){}

  viewScheduledFlights():Observable<ScheduleFlight[]>{
    //return this._http.get(this.baseUrl+"/viewAll",this.options).pipe(map((response: Response) => response.json()))
    //.pipe(catchError(this.errorHandler));
    return this.http.get<ScheduleFlight[]>(this.baseUrl+'/viewAll').pipe(catchError(this.errorHandler));
  }

  viewScheduledFlight(flightId:Number):Observable<ScheduleFlight>{
    // this._http.get(this.baseUrl+"/viewF/"+flightId,this.options).pipe(map((response: Response) => response.json()))
    //.pipe(catchError(this.errorHandler));
    return this.http.get<ScheduleFlight>(this.baseUrl+'/viewF/'+flightId).pipe(catchError(this.errorHandler));
  }

  modifyScheduledFlight(sflight:ScheduleFlight)
  {
    //return this._http.put(this.baseUrl+"/modify",JSON.stringify(sflight),this.options).pipe(map((response: Response) => response.json()))
    //.pipe(catchError(this.errorHandler));
    return this.http.put(this.baseUrl + '/modify/', JSON.stringify(sflight), this.options).pipe(catchError(this.errorHandler));
  }

  deleteScheduledFlight(sFlight:ScheduleFlight)
  {
    //return this._http.get(this.baseUrl+"/delete/"+flightId,this.options).pipe(map((response: Response) => response.json()))
    //.pipe(catchError(this.errorHandler));
    console.log(sFlight)
    //return this.http.delete(this.baseUrl + '/delete/'+flightId, this.options).pipe(catchError(this.errorHandler));
  }

  addscheduledFlight(sflight:ScheduleFlight)
  {
    //return this._http.put(this.baseUrl+"/addSCheduledFlights",JSON.stringify(sflight),this.options).pipe(map((response: Response) => response.json()))
    //.pipe(catchError(this.errorHandler));
    console.log(sflight);
    return this.http.post(this.baseUrl + '/addSCheduledFlights/', JSON.stringify(sflight), this.options).pipe(catchError(this.errorHandler));
  }

  getSchedule(id:number):Observable<Schedule>
  {
    return this.http.get<Schedule>(this.baseUrl+'/getSchedule/'+id).pipe(catchError(this.errorHandler));
  }

  errorHandler(error:Response){
    return Observable.throw(error||"SERVER ERROR");  
  }

  getter()
  {
    return this.scheduleFlight;
  }

  setter(scheduleFlight:ScheduleFlight)
  {
    this.scheduleFlight=scheduleFlight;
  }
}