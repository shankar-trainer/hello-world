import {Component, OnInit} from '@angular/core';
// import {demo} from "../../demo/for-demo"; // for testing
import {Employee} from "../../entities/employee";
import {HttpService} from "../service/http.service";
@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit{
  private httpService : HttpService
  private employees : Array<Employee>
  constructor(httpService: HttpService) {
    this.employees = new Array<Employee>()
    this.httpService = httpService;
  }

  ngOnInit() : void {
    this.httpService.readsEmployeesOnly().subscribe(
      (response : Employee[]) => {
        this.employees = response
        // console.log(this.employees) // store response from api by spring boot
        /*let e1 = this.employees[0]
        console.log(e1._position) // work
        console.log(e1.position) // undefined */
      })
  }
  getEmployees () : Employee[] { // recommend don't use private getter in typescript is bad
      return this.employees
  }

  delete (eid : number, index : number) : void {
    if (window.confirm('Are you sure for cleaning employee id '+eid+' ?')) { // if true
        this.httpService.deleteEmployee(eid).subscribe(
          (response : any) => {
            console.log(response)
            // splice() method changes the content of an array,
            // and syntax
            // array.splice(index, howMany, [element1][, ..., elementN]);
            // index − Index at which to start changing the array.
            // howMany - An integer indicating the number of old array elements to remove. If howMany is 0, no elements are removed.
            if (response.data == false) {
              window.confirm('Can not delete. because employee id '+eid+' have had some address')
            }
            else {
              this.employees.splice(index,1)
            }
        })
    }
  }


}

