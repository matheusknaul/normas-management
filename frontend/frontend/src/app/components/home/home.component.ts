import { Component } from '@angular/core';
import { GrupoModalComponent } from '../grupo-modal/grupo-modal.component';

@Component({
  selector: 'app-home',
  imports: [GrupoModalComponent],
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
