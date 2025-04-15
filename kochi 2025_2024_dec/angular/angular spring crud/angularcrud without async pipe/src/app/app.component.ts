import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { ShowallpersonComponent } from './showallperson/showallperson.component';
import { SearchpersonComponent } from './searchperson/searchperson.component';
import { AddpersonComponent } from './addperson/addperson.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, ShowallpersonComponent,RouterLink,SearchpersonComponent,AddpersonComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angularcrud';
}
