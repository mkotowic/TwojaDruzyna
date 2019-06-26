import { Team } from "./team";

export class Player {
    id: number;
    firstName: string;
    secondName: string;
    team: Team;
    position: string;
    gender: string;
    goals: number;
    shots: number;
    faults: number;
    card: string;
    captain: boolean;
    injured: boolean;
    age: number
}
