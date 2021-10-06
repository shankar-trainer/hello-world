import { Flight } from "./Flight";
import { Schedule } from "./Schedule";


export class ScheduleFlight {
    
    scheduleId: Number=888;
        flight:{
            flightNumber:Number,
            carrierName:String,
            flightModel:String,
            seatCapacity:Number
        };
        availableSeats:Number=999;
        schedule:{
            scheduleId:Number,
            sourceAirport:{
                airportCode:String,
                airportName:String,
                airportLocation:String
            },
            destinationAirport:{
                airportCode:String,
                airportName:String,
                airportLocation:String
            },
            arrival:Date,
            departureTime:Date
        }
     
    }
