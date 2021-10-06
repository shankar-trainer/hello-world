package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exceptions.*;
import com.cg.entity.Booking;
import com.cg.entity.Payment;
import com.cg.entity.Seat;
import com.cg.entity.Ticket;
import com.cg.dao.*;
import com.cg.dao.BookingDao;

@Service
public class BookingServiceImpl implements BookingServiceInterface {
	@Autowired(required = true)
	BookingDao bookingdao;

	@Override
	public List<Booking> getListOfSeats() {
		// TODO Auto-generated method stub
		return bookingdao.findAll();
	}

	@Override
	public Booking getSeatById(int seatId) throws BookingBlockedException {
		// TODO Auto-generated method stub
		if (!bookingdao.existsById(seatId)) {
			throw new BookingBlockedException("Seat with id : [" + seatId + "] is blocked/already booked");
		}
		return bookingdao.getOne(seatId);
	}

	@Override
	public List<Seat> chooseSeats(int seatId) {
		// TODO Auto-generated method stub
		return bookingdao.save(null);
	}

	@Override
	public double calculateTotalCost(double seatPrice, int noOfSeats) throws SeatNotFoundException {
		// TODO Auto-generated method stub
		if (bookingdao.existsById(noOfSeats)) {
			double totalCost = seatPrice * noOfSeats;
			return bookingdao.save(totalCost);
		} else {
			throw new SeatNotFoundException("Please select seats/seat");
		}
	}

	@Override
	public Payment choosePaymentMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean makePayment(double totalcost, String paymentMethod) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if (bookingdao.exists(paymentMethod)) {
			return bookingdao.save(paymentMethod);
		}
		return flag;
	}

	@Override
	public Booking getTicketById(int ticketId) {
		// TODO Auto-generated method stub
		return bookingdao.getOne(ticketId);
	}

	@Override
	public boolean cancelTicketById(int seatId) throws TicketCancellationException {

		boolean flag = false;
		if (bookingdao.existsById(seatId)) {
			// deleteTheatre = theatreRepo.findById(theatreId).get();
			bookingdao.deleteById(seatId);
		} else {
			throw new TicketCancellationException("Cancellation Failed : Id not found");
		}
		return flag;

	}

}
