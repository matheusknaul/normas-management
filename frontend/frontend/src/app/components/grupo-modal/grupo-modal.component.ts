import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-grupo-modal',
  imports: [],
  templateUrl: './grupo-modal.component.html',
  styleUrl: './grupo-modal.component.css'
})
export class GrupoModalComponent {
  @Output() close = new EventEmitter<void>();

  onClose(){
    this.close.emit();
  }
}
