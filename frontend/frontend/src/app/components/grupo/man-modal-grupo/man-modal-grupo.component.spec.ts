import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ManModalGrupoComponent } from './man-modal-grupo.component';

describe('ManModalGrupoComponent', () => {
  let component: ManModalGrupoComponent;
  let fixture: ComponentFixture<ManModalGrupoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ManModalGrupoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ManModalGrupoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
