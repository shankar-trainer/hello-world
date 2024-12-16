import {Component, OnInit} from '@angular/core';
// import {demo} from "../../demo/for-demo";
import {Employee} from "../../entities/employee";
import {HttpService} from "../service/http.service";
@Component({
  selector: 'app-both-list',
  templateUrl: './both-list.component.html',
  styleUrls: ['./both-list.component.css']
})
export class BothListComponent implements OnInit{

  private httpService : HttpService
  private employees : Employee[]
  constructor(httpService: HttpService) {
    this.employees = new Array<Employee>()
    this.httpService = httpService;
  }
  ngOnInit()  {
    this.httpService.readsEmployees().subscribe(
      (response : Employee[]) => {
        this.employees = response
        // console.log(this.employees)
    })
  }
  getEmployeeHasAddressesList () : Employee[] {
    return this.employees;
  }
}
