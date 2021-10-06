package com.flight.service;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.ScheduledFlightDao;
import com.flight.entities.Airport;
import com.flight.entities.Flight;
import com.flight.entities.Schedule;
import com.flight.entities.ScheduledFlight;
import com.flight.exceptions.RecordAlreadyPresentException;
import com.flight.exceptions.RecordNotFoundException;
import com.flight.repositories.AirportRepository;
import com.flight.repositories.ScheduledFlightRepository;

@Service
public class ScheduledFlightServiceImpl implements ScheduledFlightService {
	
	Logger logger=LoggerFactory.getLogger(FlightServiceImpl.class);
	
	
	@Autowired
	private ScheduledFlightRepository sfRep;
	
	@Autowired
	private ScheduledFlightDao sfDao;
	
	@Autowired
	private AirportRepository airRepo;
	

	/**
	 * This function is used to add the ScheduledFlight object to database
	 * 
	 * @author Garima
	 * @param ScheduleFlight object to be added
	 * @return scheduledFlight object added
	 * @version 1.0
	 * @since 29-10-2020
	 */


	@Override
	public ScheduledFlight scheduleFlight(ScheduledFlight scheduleFlight) {
		logger.info("schedule flight method is accessed at service layer");
			if(validateScheduledFlight(scheduleFlight))
			{
				scheduleFlight.getSchedule().setDepartureTime(LocalDateTime.now());
				scheduleFlight.getSchedule().setArrival(LocalDateTime.now());
				List<Airport>air=airRepo.findAll();
				for(Airport a:air) {
				if(scheduleFlight.getSchedule().getSourceAirport().getAirportCode().equals(a.getAirportCode())) {
				scheduleFlight.getSchedule().setSourceAirport(a);}
				if(scheduleFlight.getSchedule().getDestinationAirport().getAirportCode().equals(a.getAirportCode()))
				{
					scheduleFlight.getSchedule().setDestinationAirport(a);
				}}
				sfDao.scheduleFlight(scheduleFlight);
				return scheduleFlight;
			}
			else
			{
				throw new RecordAlreadyPresentException("Scheduled flight with id: "+scheduleFlight.getScheduleId()+" is already present!!!");
			}
	}
	

	/**
	 * This function is used to view Scheduled Flights from the source airport to destination airport on
	 * the given date
	 * 
	 * @author Garima
	 * @param Source airport, destination airport and date
	 * @return List of all flights scheduled for the given airports and date
	 * @version 1.0
	 * @since 29-10-2020
	 */

	@Override
	public List<Flight> viewScheduledFlights(Airport srcAirport, Airport destAirport, String date) {
		logger.info("view schedule flights method is accessed at service layer");
		return sfDao.viewScheduledFlights(srcAirport, destAirport, date);
	}

	
	/**
	 * This function is used to view Scheduled Flights using Flight number 
	 * 
	 * @author Garima
	 * @param Flight Number
	 * @return shows scheduled flights information using flight number provided
	 * @version 1.0
	 * @since 29-10-2020
	 */
	@Override
	public List<ScheduledFlight> viewScheduledFlightsByFlightNumber(BigInteger flightNumber) {
		logger.info("view schedule flight by flight number method is accessed at service layer");
		List<ScheduledFlight> flights=sfDao.viewScheduledFlightsByFlightNumber(flightNumber);
		if(flights.size()!=0)
		{
			return flights;
		}
		else {
			throw new RecordNotFoundException("Given flight number does not exist");
		}
		
	}

	
	/**
	 * This function is used to get the list of the ScheduledFlight
	 * 
	 * @author Garima
	 * @param None
	 * @return List of all the scheduled flights
	 * @version 1.0
	 * @since 29-10-2020
	 */
	@Override
	public List<ScheduledFlight> viewAllScheduledFlights() {
		logger.info("view all schedule flights method is accessed at service layer");
		return sfDao.viewAllScheduledFlights();
	}

	
	/**
	 * This function is used to modify the ScheduledFlight object by using flight,schedule objects and
	 * number of available seats
	 * 
	 * @author Garima
	 * @param Flight object,schedule object,number of available seats
	 * @return modify the schedule for the given Flight
	 * @version 1.0
	 * @since 29-10-2020
	 */
	@Override
	public ScheduledFlight modifyScheduledFlight(Flight flight, Schedule schedule, int availableSeats) {
		logger.info("modify schedule flight method is accessed at service layer");
			List<ScheduledFlight> scheduledFlights=sfDao.viewAllScheduledFlights();
			ScheduledFlight scheduledFlig=new ScheduledFlight(flight, availableSeats, schedule);
			for(ScheduledFlight sf:scheduledFlights)
			{
			if(sf.getSchedule().getScheduleId()==scheduledFlig.getSchedule().getScheduleId()) 
			{
				sfDao.modifyScheduledFlight(flight, schedule, availableSeats);
				scheduledFlig.setScheduleId(sf.getScheduleId());
				return scheduledFlig;
			}}
				throw new RecordNotFoundException("Given Scheduled flight does not exist");
	}

	
	/**
	 * This function is used to delete the scheduledFlight whose schedule ID is given
	 * 
	 * @author Garima
	 * @param schedule ID
	 * @return ScheduledFlight with the given Schedule ID is deleted
	 */
	@Override
	public void deleteScheduledFlight(BigInteger id) {
		logger.info("delete schedule flight method is accessed at service layer");
			//List<ScheduledFlight> scheduledFlights=sfDao.viewAllScheduledFlights();
			if(sfRep.findById(id).isPresent())
			{
				sfDao.deleteScheduledFlight(id);
			}
			else {
				throw new RecordNotFoundException("Given scheduled flight does not exist");
			}
			
	}

	
	/**
	 * This function is used to validate scheduled flight details before adding it in database
	 * 
	 * @author Garima
	 * @param ScheduledFlight object to be validated
	 * @return Gives output on console whether ScheduledFlight object is valid or not
	 * @version 1.0
	 * @since 29-10-2020
	 */
	@Override
	public boolean validateScheduledFlight(ScheduledFlight scheduledFlight) {
		logger.info("validate schedule flight method is accessed at service layer");
		List<ScheduledFlight> sFlights=viewAllScheduledFlights();
		for(ScheduledFlight sf:sFlights)
		{
			if(sf.getSchedule().getScheduleId()==scheduledFlight.getSchedule().getScheduleId())
			{
				if(sf.getSchedule().getSourceAirport().equals(scheduledFlight.getSchedule().getSourceAirport()) && sf.getSchedule().getDestinationAirport().equals(scheduledFlight.getSchedule().getDestinationAirport()))
				{
					if(sf.getSchedule().getDepartureTime().equals(scheduledFlight.getSchedule().getDepartureTime()) && sf.getSchedule().getArrival().equals(scheduledFlight.getSchedule().getArrival()))
					{
						if(sf.getFlight().getFlightNumber().equals(scheduledFlight.getFlight().getFlightNumber()))
						{
							return false;
						}
					}
				}
				
			}
		}
		return true;
	}

	
	
	

}
