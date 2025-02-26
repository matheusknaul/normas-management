import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormNormaComponent } from './form-norma.component';

describe('FormNormaComponent', () => {
  let component: FormNormaComponent;
  let fixture: ComponentFixture<FormNormaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormNormaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormNormaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
