import { CommonModule } from '@angular/common';
import { Component, SimpleChanges } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Observable } from 'rxjs';
import { Person } from './model/person';
import { PersonService } from './service/person.service';

@Component({
  selector: 'app-person-app',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './person-app.component.html',
  styleUrl: './person-app.component.css'
})
export class PersonAppComponent {

  personlist:Observable<Person[]>;

  constructor(private service:PersonService){
    this.personlist=service.getAll();
    console.log(this.personlist);
  }

  ngOnChanges(changes: SimpleChanges): void {
    //Called before any other lifecycle hook. Use it to inject dependencies, but avoid any serious work here.
    //Add '${implements OnChanges}' to the class.
    console.log('ngOnChanges called  '+changes)
  }

  ngOnInit(): void {
    //Called after the constructor, initializing input properties, and the first call to ngOnChanges.
    //Add 'implements OnInit' to the class.
    console.log('ng init called ')
  }

}
