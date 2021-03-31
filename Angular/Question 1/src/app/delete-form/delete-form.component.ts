import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Delete } from '../delete';
import { RestaurantService } from '../restaurant.service';

@Component({
  selector: 'app-delete-form',
  templateUrl: './delete-form.component.html',
  styleUrls: ['./delete-form.component.css']
})
export class DeleteFormComponent implements OnInit {

  constructor(private restuarent: RestaurantService, private router: Router) { }

  ngOnInit(): void {
  }

  deleteModel = new Delete('');

  onSubmit(value:string){
    let id = this.restuarent.myArr.indexOf(value);
    console.log(id);
    this.restuarent.myArr.splice(id, id+1);
    this.router.navigate(['/restaurant', '1']);    
  }
}