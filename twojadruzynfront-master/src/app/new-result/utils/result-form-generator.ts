import { Event } from "src/app/common/model/event";
import { FormGroup, FormControl, Validators } from "@angular/forms";
import { ResultControlNames } from "./result-control-names";

export class ResultFormGenerator {

    public static generateNewResultFormGroup(): FormGroup {
        let formGroup: FormGroup = new FormGroup({
            [ResultControlNames.MY_TEAM]: new FormControl('', Validators.required),
            [ResultControlNames.OPPOSITE_TEAM]: new FormControl('', Validators.required),
            [ResultControlNames.MY_TEAM_SCORES]: new FormControl('', Validators.required),
            [ResultControlNames.OPPOSITE_TEAM_SCORES]: new FormControl('', Validators.required),
            [ResultControlNames.REFEREE_NAME]: new FormControl('', Validators.required),
            [ResultControlNames.STADIUM_NAME]: new FormControl('', Validators.required),
            [ResultControlNames.CITY]: new FormControl('', Validators.required),
            [ResultControlNames.COUNTRY]: new FormControl('', Validators.required),
            [ResultControlNames.MATCH_DATE]: new FormControl('', Validators.required),
        })

        return formGroup;
    }
}