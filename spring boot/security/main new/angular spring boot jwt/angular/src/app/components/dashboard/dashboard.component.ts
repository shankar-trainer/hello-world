import { CommonModule } from '@angular/common';
import { AfterViewInit, Component, HostListener } from '@angular/core';
import { Router, RouterModule } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss'],
  standalone: true,
  imports: [CommonModule, RouterModule]
})
export class DashboardComponent implements AfterViewInit {
  constructor(private authService: AuthService, private router: Router) {}

  logout(): void {
    this.authService.logout();
    this.router.navigate(['/login']);
  }

   ngAfterViewInit() {
    this.updateParallax(); // Atualiza na inicialização
  }

  @HostListener('window:scroll') // <-- removido ['$event']
  onWindowScroll() {
    this.updateParallax();
  }

 private updateParallax() {
  const icons = document.querySelectorAll('.animated-bg .icon') as NodeListOf<HTMLElement>;
  const scrollTop = window.pageYOffset || document.documentElement.scrollTop;

  icons.forEach(icon => {
    const speed = parseFloat(icon.dataset['speed'] || '0.2'); // <-- aqui
    icon.style.transform = `translateY(${scrollTop * speed}px)`;
  });
}

}