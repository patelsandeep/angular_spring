import { Component, OnInit } from '@angular/core';
import { UserService } from './UserService';
import { User } from './User';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
 
  UserList: any = [];

  constructor(private userservice: UserService) { }
  
  ngOnInit() {

    this.userservice.getAllUsers().subscribe((data: any) => {
      this.UserList = data;
    });
  }

}
