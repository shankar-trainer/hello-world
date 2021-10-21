package com.cg.services;

import java.util.List;

import com.cg.exceptions.BookingBlockedException;
import com.cg.exceptions.SeatNotFoundException;
import com.cg.exceptions.TicketNotFoundException;
import com.cg.entity.Booking;
import com.cg.entity.Seat;
import com.cg.entity.Ticket;
import com.cg.entity.Payment;
import com.cg.exceptions.TicketCancellationException;

public interface BookingServiceInterface {
	
	public List<Seat> chooseSeats(int seatId);
	public double calculateTotalCost(double seatPrice, int noOfSeats) throws SeatNotFoundException;
	public Payment choosePaymentMethod();
	public boolean makePayment(double totalcost,String paymentMethod);
//	public Ticket showTicket(int ticketId);
//	public Boolean cancelBookings(int seatId);

	public List<Booking> getListOfSeats();
	public Booking getSeatById(int seatId) throws BookingBlockedException;

	public boolean cancelTicketById(int seatId) throws TicketCancellationException;
	public Booking getTicketById(int ticketId) throws TicketNotFoundException;
	

}
