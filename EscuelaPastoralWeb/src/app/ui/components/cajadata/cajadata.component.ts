import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-cajadata',
  templateUrl: './cajadata.component.html',
  styleUrls: ['./cajadata.component.css']
})
export class CajadataComponent {
  @Input() label=""

}
