import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateallcontactsComponent } from './updateallcontacts.component';

describe('UpdateallcontactsComponent', () => {
  let component: UpdateallcontactsComponent;
  let fixture: ComponentFixture<UpdateallcontactsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateallcontactsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdateallcontactsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
