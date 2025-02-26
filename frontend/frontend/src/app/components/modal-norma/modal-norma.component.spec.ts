import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModalNormaComponent } from './modal-norma.component';

describe('ModalNormaComponent', () => {
  let component: ModalNormaComponent;
  let fixture: ComponentFixture<ModalNormaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ModalNormaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ModalNormaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
