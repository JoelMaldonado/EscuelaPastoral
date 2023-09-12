import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-cajatexto',
  templateUrl: './cajatexto.component.html',
  styleUrls: ['./cajatexto.component.css']
})
export class CajatextoComponent {

  @Input() label = "";
  @Input() placeholder = "";
}
