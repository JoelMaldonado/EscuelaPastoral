import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent {

  badgevisible = false;

  constructor(
    private router: Router,
  ) {

  }

  badgevisibility() {
    this.badgevisible = true;
  }

  navegar(ruta: string) {
    this.router.navigateByUrl(ruta)
  }
}
