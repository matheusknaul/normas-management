import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListNormasComponent } from './list-normas.component';

describe('ListNormasComponent', () => {
  let component: ListNormasComponent;
  let fixture: ComponentFixture<ListNormasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListNormasComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListNormasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
