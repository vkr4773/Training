import { Component } from '@angular/core';
import { ResturantService } from './resturant.service';
import { Resturant } from './Resturant.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {


  constructor(private restSrv:ResturantService)
  {}

  resturant:Resturant={"resturantId":0,"resturantName":"","location":"","rating":0};
  saveResturant()
  {
    this.restSrv.saveResturant(this.resturant).subscribe(
      data=> console.log(data),
      error=>console.log(error)
    );
  }


  updateResturant()
  {

   // let resturant:Resturant={"resturantId":1,"resturantName":"VAMPIRE","location":"MUM","rating":1};
    this.restSrv.updateResturant(this.resturant).subscribe(
      data=> console.log(data),
      error=>console.log(error)
    );
  }



  deleteResturant()
  {

    //this.resturant.resturantId=1;
    this.restSrv.deleteResturant(this.resturant.resturantId).subscribe(
      data=> console.log(data),
      error=>console.log(error)
    );
  }


  getResturant()
  {

   // this.resturant.resturantId=2;
    this.restSrv.getResturant(this.resturant.resturantId).subscribe(
      data=> this.resturant=data,
      error=>console.log(error)
    );

    console.log(this.resturant.resturantName);
  }

  resturants:Resturant[]=[];
  getResturants()
  {

      this.restSrv.getAllResturants().subscribe(
      data=> this.resturants=data,
      error=>console.log(error)
    );

    for(let rest of this.resturants)
    {
      console.log(rest.resturantName);
    }

  }

}
