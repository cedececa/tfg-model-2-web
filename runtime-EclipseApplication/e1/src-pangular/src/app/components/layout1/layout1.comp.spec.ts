import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Layout1Component } from './layout1.comp';

describe('Layout1Component', () => {
  let component: Layout1Component;
  let fixture: ComponentFixture<Layout1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Layout1Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Layout1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
