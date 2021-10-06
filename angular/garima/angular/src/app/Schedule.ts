import { Airport } from "./Airport";

export class Schedule
{
    scheduleId:Number;
    sourceAirport:Airport;
    destinationAirport:Airport;
	arrival:Date;
	departureTime:Date;
}