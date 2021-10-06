import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { HttpModule } from '@angular/http';
import {ReactiveFormsModule,FormBuilder} from '@angular/forms';;
import {Routes,RouterModule }  from '@angular/router';
import{ AdminSearchFlightComponent} from './components/adminSearchFlight/adminSearchFlight.component';
import{AdminViewFlightComponent} from './components/adminViewFlight/adminViewFlight.component';
import{AdminUpdateFlightComponent} from './components/adminUpdateFlight/adminUpdateFlight.component';
import{AdminAddFlightComponent} from './components/adminAddFlight/adminAddFlight.component';
import{AdminViewAllFlightComponent} from './components/adminViewAllFlights/adminViewAllFlights.component';
import{AdminHomeComponent} from './components/adminHomePage/adminHome.component';
import{AdminSearchScheduleFlightComponent} from './components/adminSearchScheduleFlight/adminSearchScheduleFlight.component';
import{AdminViewScheduleFlightComponent} from './components/adminViewScheduleFlight/adminViewScheduleFlight.component';
import{AdminViewAllScheduledFlightsComponent} from './components/adminViewAllScheduleFlight/adminViewAllScheduleFlight.component';
import{AdminAddScheduledFlightComponent} from './components/adminScheduleFlight/adminScheduledFlight.component';
import{AdminUpdateSFlightComponent} from './components/adminUpdateSFlight/adminUpdateSFlight.component';

const appRoutes:Routes =[
    {path:'search',component:AdminSearchFlightComponent},
    {path:'viewFlight',component:AdminViewFlightComponent},
    {path:'updateFlight',component:AdminUpdateFlightComponent},
    {path:'addFlight',component:AdminAddFlightComponent},
    {path:'allFl',component:AdminViewAllFlightComponent},
    {path:'',component:AdminHomeComponent},
    {path:'scheduledFlight/search',component:AdminSearchScheduleFlightComponent},
    {path:'scheduledFlight/show',component:AdminViewScheduleFlightComponent},
    {path:'scheduledFlight/viewAllF',component:AdminViewAllScheduledFlightsComponent},
    {path:'scheduledFlight/add',component:AdminAddScheduledFlightComponent},
    {path:'scheduledFlight/update',component:AdminUpdateSFlightComponent}
]

@NgModule({
    imports: [
        BrowserModule,
        FormsModule,
        HttpClientModule,
        ReactiveFormsModule,
        HttpModule,
        RouterModule.forRoot(appRoutes)
    ],
    declarations: [
        AppComponent,AdminSearchFlightComponent,AdminViewFlightComponent,AdminUpdateFlightComponent,AdminAddFlightComponent,
        AdminViewAllFlightComponent,AdminHomeComponent,AdminSearchScheduleFlightComponent,
        AdminViewScheduleFlightComponent,AdminViewAllScheduledFlightsComponent,AdminAddScheduledFlightComponent,
        AdminUpdateSFlightComponent
        
		],
    providers: [],
    bootstrap: [AppComponent]
})

export class AppModule { }