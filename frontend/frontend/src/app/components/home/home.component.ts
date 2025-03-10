import { Component } from '@angular/core';
import { GrupoModalComponent } from '../grupo-modal/grupo-modal.component';
import { ManModalGrupoComponent } from '../grupo/man-modal-grupo/man-modal-grupo.component';

@Component({
  selector: 'app-home',
  imports: [GrupoModalComponent, ManModalGrupoComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  isModalOpen = false;

  openModal(){
    this.isModalOpen = true;
  }

  closeModal(){
    this.isModalOpen = false;
  }
}
