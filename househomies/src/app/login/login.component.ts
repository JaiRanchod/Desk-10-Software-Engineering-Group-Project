import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { DataService } from '../services/data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {
  focus;
  focus1;
  isLoading = false;
  form: any = {};
  isLoggedIn: Boolean;
  isLoginFailed = false;
  errorMessage = '';
  roles: string[] = [];
  public Email: String;
  public Password: String;
  public successStatus: String;

  constructor(private dataService: DataService, private router: Router) { }


  onLogin(form: NgForm){
    console.log(form.value);
  }

  ngOnInit() {
  }

  handleClick(): void {
    let userEmail = (document.getElementById('email') as HTMLInputElement).value;
    let userPassword = (document.getElementById('password') as HTMLInputElement).value;
    console.log(userEmail, userPassword);
    this.dataService.getAll2(userEmail).subscribe(
      data => {
        console.log(data);
        console.log(data[0].Email + " " + data[0].Password);
        if(userEmail == data[0].Email && userPassword == data[0].Password){
          this.dataService.email = userEmail;
          this.isLoggedIn = true;
          this.router.navigate(['/matches']);
          this.successStatus = "Successful Login...Redirecting"
          //this.dataService.changeURL(userEmail);
        }
        else{
          this.successStatus = "Incorrect Details Entered"
        }
      }
    )
    /*this.authService.login(this.form).subscribe(
      data => {
        this.tokenStorage.saveToken(data.accessToken);
        this.tokenStorage.saveUser(data);
        this.isLoggedIn = true;
        this.isLoginFailed = false;
        this.roles = this.tokenStorage.getUser().roles;
        this.reloadPage();
      },
      err => {
        this.errorMessage = err.errorMessage;
        this.isLoginFailed = true;
      });*/
  }

  reloadPage(): void {
    window.location.reload();
  }

}
