import { Component, OnInit } from '@angular/core';
import { Student } from '../shared/Student';
import { Router, ActivatedRoute } from '@angular/router';
import { StudentService } from '../shared/student.service';
import { first } from 'rxjs/operators';
import { HttpClient } from '@angular/common/http';
//import{ MatDialog} from '@angular/material/dialog';
import { FormGroup, Validators, FormBuilder } from '@angular/forms';
import { Observable } from 'rxjs';
import { UpdateComponent } from '../update/update.component';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {
   
   
   studentId: number;
  students:Student[];
  student:Student;
 //studentUpdateId=null;

  constructor(private router: Router,private route:ActivatedRoute, private service: StudentService, 
   // private alert: MatDialog,
    private formBuilder: FormBuilder) { }

  ngOnInit():void {
    this.service.getStudent()
      .subscribe( res => {
        this.students = res;
        //alert(this.students);
        //console.log(this.students[0].studentName);
      });

      
 }

 getData(){
   this.service.getStudent().subscribe(data=>{
     this.students=data;
      
   })
 }
sss
 updateStudent(j){
  //  console.log(studentId);
   //let dialogRef = this.alert.open(UpdateComponent);
   //dialogRef.componentInstance.student = this.students[j];
      this.router.navigate(['update/'+j])
    
      
    };

  delete(j):any{
        console.log(j);
        this.service.deleteStudent(j).subscribe(data=>{
          this.getData();
        }
          
        )
       
  };

  
}
