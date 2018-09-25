import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import { map } from 'rxjs/operators';
import { Observable, of } from 'rxjs';
import { User } from './User';
const httpOptions = {
  headers: new HttpHeaders({ "content-Type": "application/json" })
};
@Injectable({
  providedIn: 'root'
})
export class UserService {
  private getListURL = "http://localhost:8080/user";

  constructor(private http: HttpClient) { }
  //Get data from API.
  getAllUsers(): Observable<any> {
    return this.http.get<any>(this.getListURL);
  }
}