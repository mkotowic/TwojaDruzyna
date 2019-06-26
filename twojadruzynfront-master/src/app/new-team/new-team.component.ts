import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { TeamControlNames } from './utils/team-control-names';
import { ApiService } from '../common/api/api.service';

@Component({
  selector: 'app-new-team',
  templateUrl: './new-team.component.html',
  styleUrls: ['./new-team.component.css']
})
export class NewTeamComponent implements OnInit {
  teamFormGroup: FormGroup;

  constructor(private _api: ApiService) { }

  ngOnInit() {
    this.generateForm();
  }

  generateForm(){
    this.teamFormGroup = new FormGroup({
      [TeamControlNames.NAME]: new FormControl('', Validators.required),
      [TeamControlNames.SHORT_NAME]: new FormControl('', Validators.required),
      [TeamControlNames.CITY]: new FormControl('', Validators.required),
      [TeamControlNames.COUNTRY]: new FormControl('', Validators.required),
      [TeamControlNames.FOUNDED_DATE]: new FormControl('', Validators.required),
    })
  }

  addTeam(){
      this._api.saveTeam(this.teamFormGroup.getRawValue()).subscribe(
        res => {
          location.reload();
        }, err => {
          alert("Błąd podczas zapisywania drużyny")
        }
      )
  }

}
