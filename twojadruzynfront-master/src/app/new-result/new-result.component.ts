import { Component, OnInit } from '@angular/core';
import { Event } from '../common/model/event';
import { Team } from '../common/model/team';
import { ApiService } from '../common/api/api.service';
import { FormGroup } from '@angular/forms';
import { ResultFormGenerator } from './utils/result-form-generator';
import { ResultControlNames } from './utils/result-control-names';



@Component({
  selector: 'new-result',
  templateUrl: './new-result.component.html',
  styleUrls: ['./new-result.component.css']
})
export class NewResultComponent implements OnInit {
  teamList: Team[];

  resultControlNames = ResultControlNames;

  resultFormGroup: FormGroup;

  constructor(private apiService: ApiService) { }


  ngOnInit() {
    this.resultFormGroup = ResultFormGenerator.generateNewResultFormGroup();
    this.initTeamList();
  }

  addEventResult() {
      this.apiService.addResult(this.resultFormGroup.getRawValue()).subscribe(
        res => {
          location.reload();
        }, err => {
          alert("Błąd podczas zapisywania rezultatów")
        }
      )
  }

  initTeamList() {
    this.apiService.getAllTeams().subscribe(
      res => {
        this.teamList = res;
      }, err => {
        alert("Błąd podczas zapisywania rezultatów")
      }
    )
  }
}
