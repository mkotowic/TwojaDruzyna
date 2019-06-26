import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {Router, RouterModule, Routes} from '@angular/router';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { AppComponent } from './app.component';
import { NavigationComponent } from './navigation/navigation.component';
import { NotfoundComponent } from './notfound/notfound.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { NewResultComponent } from './new-result/new-result.component';
import { EventComponent } from './event-results/event-results.component';
import { NewTeamComponent } from './new-team/new-team.component';

const appRoutes: Routes = [
  {
    path: '',
    component: NewResultComponent,
    pathMatch:'full'
  },
  {
    path: 'results',
    component: EventComponent,
  },
  {
    path: 'feedback',
    component: FeedbackComponent
  },
  {
    path: 'newteam',
    component: NewTeamComponent
  },
  {
    path: '**',
    component: NotfoundComponent
  }
];

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    NotfoundComponent,
    NewResultComponent,
    FeedbackComponent,
    EventComponent,
    NewTeamComponent,
  ],
  imports: [
    ReactiveFormsModule,
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { 

}
