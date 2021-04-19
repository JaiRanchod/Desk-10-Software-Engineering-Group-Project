import { NgModule } from '@angular/core';
import { CommonModule, } from '@angular/common';
import { BrowserModule  } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';

import { WelcomepageComponent } from './welcomepage/welcomepage.component';
import { ProfileComponent } from './profile/profile.component';
import { SignupComponent } from './signup/signup.component';
import { MatchingComponent } from './matches/matches.component';
import { LoginComponent } from './login/login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { SettingsComponent } from './settings/settings.component';
import { ProfileEditComponent } from './profile-edit/profile-edit.component';

const routes: Routes =[
    { path: 'welcomepage',             component: WelcomepageComponent },
    { path: 'homepage',           component: HomepageComponent },
    { path: 'user-profile',     component: ProfileComponent },
    { path: 'user-profile-edit',     component: ProfileEditComponent },
    { path: 'register',           component: SignupComponent },
    { path: 'matches',          component: MatchingComponent },
    { path: 'login',          component: LoginComponent },
    { path: 'about',           component: AboutusComponent },
    { path: 'settings',         component: SettingsComponent },
    { path: '', redirectTo: 'welcomepage', pathMatch: 'full' }
];

@NgModule({
  imports: [
    CommonModule,
    BrowserModule,
    RouterModule.forRoot(routes,{
      useHash: true
    })
  ],
  exports: [
  ],
})
export class AppRoutingModule { }
