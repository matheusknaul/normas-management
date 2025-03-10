import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-card-grupo',
  imports: [],
  templateUrl: './card-grupo.component.html',
  styleUrl: './card-grupo.component.css'
})
export class CardGrupoComponent {
  @Input() title: string = '';
  @Input() description: string = '';

  quantidade:number = 0;
}
