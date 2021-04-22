import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app.routing';
import { HttpClientModule } from '@angular/common/http';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppComponent } from './app.component';
import { SignupComponent } from './signup/signup.component';
import { MatchingComponent } from './matches/matches.component';
import { ProfileComponent } from './profile/profile.component';
import { WelcomepageComponent } from './welcomepage/welcomepage.component';
import { NavbarComponent } from './shared/navbar/navbar.component';
import { FooterComponent } from './shared/footer/footer.component';

import { HomeModule } from './welcomepage/welcomepage.module';
import { LoginComponent } from './login/login.component';

import * as typeformEmbed from '@typeform/embed';
import { HomepageComponent } from './homepage/homepage.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { SettingsComponent } from './settings/settings.component';
import { ProfileEditComponent } from './profile-edit/profile-edit.component';
import { CardComponent } from './card/card.component';


@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    MatchingComponent,
    ProfileComponent,
    NavbarComponent,
    FooterComponent,
    LoginComponent,
    HomepageComponent,
    AboutusComponent,
    SettingsComponent,
    ProfileEditComponent,
    CardComponent,
  ],
  imports: [
    BrowserModule,
    NgbModule,
    FormsModule,
    RouterModule,
    AppRoutingModule,
    HomeModule,
    HttpClientModule,
    BrowserAnimationsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
