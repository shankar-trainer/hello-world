import { Component } from '@angular/core';
import {Admin} from './admin/admin';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Home';
  data = new Admin();
}
