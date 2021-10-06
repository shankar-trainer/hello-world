import { Injectable } from '@angular/core';
import { HttpHeaders, HttpRequest, HttpClient } from '@angular/common/http';
import {Http,Response,Headers,RequestOptions} from '@angular/http';
import { map } from 'rxjs/operators';
import { catchError } from 'rxjs/operators'; 
import { Observable, throwError, from } from 'rxjs';
import{Flight} from './Flight';


@Injectable({
  providedIn: 'root'
})
export class FlightService {

  private baseUrl:String = 'http://localhost:8080/api';
  private headers = new Headers({'Content-Type':'application/json'});
  private options = new RequestOptions({headers:this.headers});
  private response:Response;
  private flight:Flight;
  public fligthId:Number;
  public setFlight:Flight;

  constructor(private _http: HttpClient,private http:Http) { }

  viewAllFlights():Observable<Flight[]>{
    //return this._http.get(this.baseUrl+"/allFlight",this.options).pipe(map((response: Response) => response.json()))
    //.pipe(catchError(this.errorHandler));
    return this._http.get<Flight[]>(this.baseUrl+'/allFlight').pipe(catchError(this.errorHandler));
  }

  viewFlight(flightId:Number):Observable<Flight>{

    return this._http.get<Flight>(this.baseUrl+'/viewFlight/'+flightId).pipe(catchError(this.errorHandler));
    //return this._http.get<Flight[]>(this.baseUrl+"/viewFlight/"+flightId,this.options).pipe(map((response: Response) => response.json()))
    //.pipe(catchError(this.errorHandler));
  }

  modifyFlight(flight:Flight)
  {
    //return this.http.put(this.baseUrl+"/updateFlight/",JSON.stringify(flight),this.options).pipe(map((response: Response) => response.json()))
    //.pipe(catchError(this.errorHandler));
    console.log(flight);
    return this.http.put(this.baseUrl + '/updateFlight/', JSON.stringify(flight), this.options).pipe(catchError(this.errorHandler));
   
  }

  deleteFlight(flightId:Number)
  {
    //return this.http.delete(this.baseUrl+"/deleteFlight/"+flightId,this.options).pipe(map((response: Response) => response.json()))
    //.pipe(catchError(this.errorHandler));
    return this.http.delete(this.baseUrl + '/deleteFlight/'+flightId, this.options).pipe(catchError(this.errorHandler));
  }

  addFlight(flight:Flight)
  {
    //return this.http.post(this.baseUrl+"/addFlight",JSON.stringify(flight),this.options).pipe(map((response: Response) => response.json()))
    //.pipe(catchError(this.errorHandler));
    console.log(flight);
    return this.http.post(this.baseUrl + '/addFlight/', JSON.stringify(flight), this.options).pipe(catchError(this.errorHandler));
  }
  errorHandler(error:Response){
    return Observable.throw(error||"SERVER ERROR");  
  }
  
}