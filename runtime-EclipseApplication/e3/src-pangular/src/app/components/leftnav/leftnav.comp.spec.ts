import { ComponentFixture, TestBed } from '@angular/core/testing';
import { leftNavComponent } from './leftnav.comp';

describe('leftNavComponent', () => {
  let component: leftNavComponent;
  let fixture: ComponentFixture<leftNavComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ leftNavComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(leftNavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
