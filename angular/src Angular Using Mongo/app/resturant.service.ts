import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Resturant } from './Resturant.model';

@Injectable({
  providedIn: 'root'
})
export class ResturantService {

  constructor(private http:HttpClient) { }

  saveResturant(resturant:Resturant)
  {
    return this.http.post<any>('http://localhost:1024/resturant',resturant);
  }

  updateResturant(resturant:Resturant)
  {
    return this.http.put<Resturant>('http://localhost:1024/resturant',resturant);
  }

  getAllResturants()
  {
    return this.http.get<Resturant[]>('http://localhost:1024/resturant');
  }


  deleteResturant(resturantId:number)
  {
    return this.http.delete(`http://localhost:1024/resturant/${resturantId}`);
  }

  getResturant(resturantId:number)
  {
    return this.http.get<Resturant>(`http://localhost:1024/resturant/${resturantId}`);
  }

}