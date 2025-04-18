import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GrupoModalComponent } from './grupo-modal.component';

describe('GrupoModalComponent', () => {
  let component: GrupoModalComponent;
  let fixture: ComponentFixture<GrupoModalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GrupoModalComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GrupoModalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
