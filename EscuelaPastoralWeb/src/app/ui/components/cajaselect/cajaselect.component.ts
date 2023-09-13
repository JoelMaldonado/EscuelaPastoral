import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-cajaselect',
  templateUrl: './cajaselect.component.html',
  styleUrls: ['./cajaselect.component.css']
})
export class CajaselectComponent {
  @Input() label = "";
  @Input() placeholder = "";
  @Input() lista:String[]=[]
}
