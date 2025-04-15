package com.packt.legacy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieDao {

	private Map<MovieHall, Map<ShowTime, Map<String, Boolean>>> config = new HashMap<MovieHall, Map<ShowTime, Map<String, Boolean>>>();
	private Map<Movie, Map<ShowTime, MovieHall>> movieSetup = new HashMap<Movie, Map<ShowTime, MovieHall>>();

	public MovieDao() {
		MovieHall screen1 = new MovieHall("screen1", 40);
		Map<ShowTime, Map<String, Boolean>> hall1Setup = new HashMap<ShowTime, Map<String, Boolean>>();
		for (ShowTime time : ShowTime.values()) {
			Map<String, Boolean> availableSeats = new HashMap<String, Boolean>();
			for (int i = 1; i < 41; i++) {
				availableSeats.put("a" + i, true);
			}
			hall1Setup.put(time, availableSeats);
		}
		config.put(screen1, hall1Setup);

		MovieHall screen2 = new MovieHall("screen2", 100);
		Map<ShowTime, Map<String, Boolean>> hall2Setup = new HashMap<ShowTime, Map<String, Boolean>>();
		for (ShowTime time : ShowTime.values()) {
			Map<String, Boolean> availableSeats = new HashMap<String, Boolean>();
			for (int i = 1; i < 101; i++) {
				availableSeats.put("b" + i, true);
			}
			hall2Setup.put(time, availableSeats);
		}
		config.put(screen2, hall2Setup);

		Movie spiderMan = new Movie("Spriderman 2", "Amazing spiderman2");
		Movie hobbit = new Movie("The HOBBIT", "The Desolation of Smaug");

		Map<ShowTime, MovieHall> spidermanShows = new HashMap<ShowTime, MovieHall>();
		for (ShowTime time : ShowTime.values()) {
			spidermanShows.put(time, screen1);
		}
		movieSetup.put(spiderMan, spidermanShows);

		Map<ShowTime, MovieHall> hobbitShows = new HashMap<ShowTime, MovieHall>();
		for (ShowTime time : ShowTime.values()) {
			spidermanShows.put(time, screen2);
		}
		movieSetup.put(hobbit, hobbitShows);

	}

	public MovieHall findMovie(Movie movie, ShowTime time) {
		Map<ShowTime, MovieHall> show = movieSetup.get(movie);
		if (show != null) {
			return show.get(time);
		}
		return null;
	}

	public List<String> getAvilableSeats(Movie movie, ShowTime time) {

		List<String> available = new ArrayList<String>();
		MovieHall hall = findMovie(movie, time);
		if (hall != null) {
			Map<ShowTime, Map<String, Boolean>> showTimeAvailabilityMap = config
					.get(hall);
			if (showTimeAvailabilityMap != null) {
				Map<String, Boolean> availableSeats = showTimeAvailabilityMap
						.get(time);
				if (availableSeats != null) {
					for (String seat : availableSeats.keySet()) {
						Boolean isBooked = availableSeats.get(seat);
						if (isBooked) {
							available.add(seat);
						}
					}
				}
			}
		}

		return available;
	}
	
	public void book(MovieHall hall, ShowTime time, String seat) throws BookingException{
	
		if (hall != null) {
			Map<ShowTime, Map<String, Boolean>> showTimeAvailabilityMap = config
					.get(hall);
			if (showTimeAvailabilityMap != null) {
				Map<String, Boolean> availableSeats = showTimeAvailabilityMap
						.get(time);
				if (availableSeats != null) {
					Boolean isAvailable = availableSeats.get(seat);
					if(isAvailable != null) {
						if(isAvailable.booleanValue()) {
						availableSeats.put(seat, false);
						}else {
							throw new BookingException(ErrorType.SeatAlreadyBooked);
						}
					}else {
						throw new BookingException(ErrorType.SeatDoesNotExist);
						
					}
				}else {
					throw new BookingException(ErrorType.ShowTimeDoesNotExist);
				}
			}
		}else {
			throw new BookingException(ErrorType.InvalidMovie);
		}
	}
}
