import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { Counterapp1Component } from './counterapp1/counterapp1.component';
import { Counterapp2Component } from "./counterapp2/counterapp2.component";
import { Counterapp3Component } from "./counterapp3/counterapp3.component";
import { ShoppingKartComponent } from "./shopping-kart/shopping-kart.component";
import { ShoppingKart1Component } from "./shopping-kart1/shopping-kart1.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, RouterLink, Counterapp1Component, Counterapp2Component, Counterapp3Component, ShoppingKartComponent, ShoppingKart1Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'app1';
}
