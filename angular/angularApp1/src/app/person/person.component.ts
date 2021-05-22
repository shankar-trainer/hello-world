import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators, FormGroupDirective } from '@angular/forms';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css'],
  //[REACTIVE_FORM_DIRECTIVES]
})
export class PersonComponent implements OnInit {

  personForm:FormGroup;
  personId:FormControl;
  personName:FormControl;
  personSalary:FormControl;

  constructor(private builder:FormBuilder) {
    this.personId=new FormControl('',[Validators.required]);
    this.personName=new FormControl('',[Validators.required,Validators.minLength(10)]);
    this.personSalary=new FormControl('',[Validators.required]);
   
  this.personForm
  =this.builder.group({personId:this.personId,personName:this.personName,personSalary:this.personSalary});
  }

  login(){
    console.log(this.personForm.value);
  }
  ngOnInit(): void {
  }

}
