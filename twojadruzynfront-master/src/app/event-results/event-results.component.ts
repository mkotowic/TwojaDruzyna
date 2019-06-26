import { Component, OnInit } from '@angular/core';
import { Event } from '../common/model/event';
import { ApiService } from '../common/api/api.service';

@Component({
  selector: 'event-results',
  templateUrl: './event-results.component.html',
})
export class EventComponent implements OnInit {

  eventResultList: Event[];

  constructor(private apiService: ApiService) { }

  ngOnInit() {
    this.initEventResultList();
  }

  initEventResultList(){
    this.apiService.getAllEvents().subscribe(
      res => {
        this.eventResultList=res;
      }, err => {
        alert("Błąd podczas pobierania rezultatów")
      }
    )
  }
}
