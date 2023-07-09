import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ArticuloComponent } from './articulo.comp';

describe('ArticuloComponent', () => {
  let component: ArticuloComponent;
  let fixture: ComponentFixture<ArticuloComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ArticuloComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ArticuloComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
