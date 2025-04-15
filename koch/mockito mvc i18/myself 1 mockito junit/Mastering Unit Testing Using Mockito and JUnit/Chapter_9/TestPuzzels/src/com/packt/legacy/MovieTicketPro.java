package com.packt.legacy;

import java.util.List;

import javax.swing.JOptionPane;

public class MovieTicketPro {

	public void book(Movie movie, ShowTime time, int noOfTickets) {
		MovieDao dao = getMovieDao();
		MovieHall hall = dao.findMovie(movie, time);

		if (hall != null) {
			List<String> seats = dao.getAvilableSeats(movie, time);
			if (seats.size() < noOfTickets) {
				getErrorMessageDisplayer().showMessage("Booking message",
						"Ticket is not available", JOptionPane.WARNING_MESSAGE);
				return;
			}
			int booked = 0;
			String bookedSeats = "";
			for (String aSeat : seats) {
				try {
					dao.book(hall, time, aSeat);
					bookedSeats += " " + aSeat;
					booked++;
					if (booked == noOfTickets) {
						getErrorMessageDisplayer().showMessage("Booking Info",
								"Following tickets" + bookedSeats + " Booked",
								JOptionPane.ERROR_MESSAGE);
						break;
					}
				} catch (BookingException e) {
					if (e.getType().equals(ErrorType.SeatAlreadyBooked)) {
						getErrorMessageDisplayer().showMessage(
								"Booking message", "Ticket is not available",
								JOptionPane.WARNING_MESSAGE);
						boolean yes = getErrorMessageDisplayer()
								.showConfirmMessage("Booking message",
										"Adjacent seats not available. Can I book any other seat?");

						if (yes) {
							getErrorMessageDisplayer().showMessage(
									"Booking information",
									"Going to auto allocate seats.",
									JOptionPane.INFORMATION_MESSAGE);
							break;
						}

					}
				} catch (Exception e) {
					getErrorMessageDisplayer().showMessage("Booking Error",
							"Could not book ticket", JOptionPane.ERROR_MESSAGE);
					break;
				}
			}
		} else {
			getErrorMessageDisplayer().showMessage("Booking message",
					"Movie or showtime not available",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	protected MovieDao getMovieDao() {
		return new MovieDao();
	}

	protected ErrorMessageDisplayer getErrorMessageDisplayer() {
		return new BookingErrorController();
	}
}
