import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-norma',
  imports: [],
  templateUrl: './norma.component.html',
  styleUrl: './norma.component.css'
})
export class NormaComponent {
  @Input() tag: string = "";
  @Input() number: string = "";
  @Input() description: string = "";
  @Input() status: string = "";
}
