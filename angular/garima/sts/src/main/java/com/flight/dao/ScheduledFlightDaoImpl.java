package com.flight.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flight.entities.Airport;
import com.flight.entities.Flight;
import com.flight.entities.Schedule;
import com.flight.entities.ScheduledFlight;
import com.flight.repositories.ScheduledFlightRepository;

@Repository
public class ScheduledFlightDaoImpl implements ScheduledFlightDao {
	Logger logger= LoggerFactory.getLogger(ScheduledFlightDaoImpl.class);
	
	@Autowired
	private ScheduledFlightRepository scheduledFlightRepository;
	
	
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
		logger.info("Schedule Flight method is accessed at DAO Layer");
		return scheduledFlightRepository.save(scheduleFlight);
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
		logger.info("View Schedule Flights method is accessed at DAO Layer");
		List<Flight> flights=new ArrayList<>();
		List<ScheduledFlight> scheduledFlight=scheduledFlightRepository.findAll();
		for(ScheduledFlight sf:scheduledFlight)
		{
			if((sf.getSchedule().getSourceAirport().equals(srcAirport)) && (sf.getSchedule().getDestinationAirport().equals(destAirport)))
					{
						if((sf.getSchedule().getDepartureTime().equals(date)) || (sf.getSchedule().getArrival().equals(date)))
						{
							flights.add(sf.getFlight());
						}
					}
		}
		return flights;
		
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
	public List<ScheduledFlight> viewScheduledFlightsByFlightNumber(BigInteger flightNumber)
	{
		logger.info("view scheduled flight by flight number is accessed at DAO layer");
		List<ScheduledFlight>flights=new ArrayList<>();
		List<ScheduledFlight> scheduledFlight=scheduledFlightRepository.findAll();
		for(ScheduledFlight sf:scheduledFlight)
		{
			if(sf.getFlight().getFlightNumber().equals(flightNumber))
			{
				flights.add(sf);
			}
		}
		return flights;
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
		logger.info("view All Schedule Flight method is accessed at DAO Layer");
		return scheduledFlightRepository.findAll();
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
		logger.info("Modify Schedule Flight method is accessed at DAO Layer");
		ScheduledFlight scheduledFlight1=new ScheduledFlight(flight,availableSeats,schedule);
		return scheduledFlightRepository.save(scheduledFlight1);
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
		logger.info(" delete Schedule Flight method is accessed at DAO Layer");
		scheduledFlightRepository.deleteById(id);
	}

	

	

}
