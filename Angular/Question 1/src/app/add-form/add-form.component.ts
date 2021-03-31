import { Component, OnInit } from '@angular/core';
import { RestaurantService } from '../restaurant.service';
import { Add } from '../add';
import { Router } from '@angular/router';
@Component({
  selector: 'app-add-form',
  templateUrl: './add-form.component.html',
  styleUrls: ['./add-form.component.css']
})
export class AddFormComponent implements OnInit {

  constructor(private restuarant: RestaurantService, private router: Router) { }

  ngOnInit(): void {
  }

  addModel = new Add('');
  
  onSubmit(value:string){
    this.restuarant.myArr.push(value);
    this.router.navigate(['/restaurant', '1']);
  }
}