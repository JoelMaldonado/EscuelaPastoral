import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-btnarchivo',
  templateUrl: './btnarchivo.component.html',
  styleUrls: ['./btnarchivo.component.css']
})
export class BtnarchivoComponent {
  @Input() label=""
  @Input() value=""

}
