import { Component } from '@angular/core';
import { SideNavToggle } from '../../components/sidenav/sidenav.component';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent {

  isSideNavCollapse = false;
  screenWidth = 0;

  onToggleSideNav(data: SideNavToggle){
    this.screenWidth = data.screenWidth;
    this.isSideNavCollapse = data.collapsed;
  }
}
