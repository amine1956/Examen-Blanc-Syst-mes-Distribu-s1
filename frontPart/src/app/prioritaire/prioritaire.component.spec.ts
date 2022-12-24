import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrioritaireComponent } from './prioritaire.component';

describe('PrioritaireComponent', () => {
  let component: PrioritaireComponent;
  let fixture: ComponentFixture<PrioritaireComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PrioritaireComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrioritaireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
