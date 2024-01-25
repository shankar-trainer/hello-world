import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-account-detail',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './account-detail.component.html',
  styleUrl: './account-detail.component.css'
})
export class AccountDetailComponent {
  //id:string='';
  id:string='';
  constructor(private route: ActivatedRoute) {}

  ngOnInit(): void {
    //this.id = this.route.snapshot.paramMap.get('id')
    //this.id=this.route.snapshot.paramMap.get('id')
    this.id=this.route.snapshot.params['id']
  }

}
