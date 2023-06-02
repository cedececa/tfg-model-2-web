import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ClickerComponent } from './clicker.comp';

describe('ClickerComponent', () => {
  let component: ClickerComponent;
  let fixture: ComponentFixture<ClickerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ClickerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ClickerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});