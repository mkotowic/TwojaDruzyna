import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import { Event } from '../model/event';
import { FeedbackViewModel } from 'src/app/feedback/feedback.component';
import { Team } from '../model/team';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private BASE_URL = "http://localhost:8080/api/";
  private  ALL_EVENTS_ENDPOINT = `${this.BASE_URL}\\event\\`;
  private  SEND_FEEDBACK_URL = `${this.BASE_URL}\\feedback/send\\`;

  private  GET_ALL_TEAMS = `${this.BASE_URL}\\team\\`;
private ADD_TEAM = `${this.BASE_URL}\\team/save\\`;

  private  ADD_RESULT = `${this.BASE_URL}\\event/save\\`;

  constructor(private http: HttpClient) { 
  }

  getAllEvents(): Observable<Event[]> {
    return this.http.get<Event[]>(this.ALL_EVENTS_ENDPOINT);
  }

  public sendFeedback(feedback: FeedbackViewModel): Observable<any> {
    return this.http.post(this.SEND_FEEDBACK_URL, feedback);
  }

  public addResult(result: Event): Observable<any>{
    return this.http.post<Event>(this.ADD_RESULT,result);
  }

  public getAllTeams(): Observable<Team[]>{
    return this.http.get<Team[]>(this.GET_ALL_TEAMS);
  }

  public saveTeam(team: Team): Observable<any>{
    return this.http.post<Team>(this.ADD_TEAM, team);
  }
}
