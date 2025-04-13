import { Component } from '@angular/core';
import { NormaComponent } from '../norma/norma.component';
import { CommonModule } from '@angular/common';
import { OnInit } from '@angular/core';

@Component({
  selector: 'app-list-normas',
  imports: [CommonModule],
  templateUrl: './list-normas.component.html',
  styleUrl: './list-normas.component.css'
})
export class ListNormasComponent implements OnInit {

  normas: any[] = [];
  paginaAtual = 1;
  itensPorPagina = 15;

  constructor() {}

  ngOnInit() {
    // Gerar 30 registros fake
    for (let i = 1; i <= 30; i++) {
      this.normas.push({
        nome: `NR-${i.toString().padStart(2, '0')}`,
        descricao: `Descrição da norma número ${i}`,
        status: i % 3 === 0 ? 'Conforme' : 'Não conforme'
      });
    }
  }

  get totalPaginas(): number {
    return Math.ceil(this.normas.length / this.itensPorPagina);
  }

  get paginatedNormas(): any[] {
    const start = (this.paginaAtual - 1) * this.itensPorPagina;
    return this.normas.slice(start, start + this.itensPorPagina);
  }

  proximaPagina() {
    if (this.paginaAtual < this.totalPaginas) {
      this.paginaAtual++;
    }
  }

  voltarPagina() {
    if (this.paginaAtual > 1) {
      this.paginaAtual--;
    }
  }
}
