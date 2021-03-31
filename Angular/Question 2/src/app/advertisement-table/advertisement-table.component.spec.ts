import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdvertisementTableComponent } from './advertisement-table.component';

describe('AdvertisementTableComponent', () => {
  let component: AdvertisementTableComponent;
  let fixture: ComponentFixture<AdvertisementTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdvertisementTableComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdvertisementTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
