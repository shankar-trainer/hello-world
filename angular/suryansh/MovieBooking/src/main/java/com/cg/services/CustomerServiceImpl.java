package com.cg.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.exceptions.TicketCancellationException;
import com.cg.dao.BookingDao;
import com.cg.dao.CustomerDao;

public class CustomerServiceImpl implements ICustomerService{
	@Autowired(required = true)
    CustomerDao customerRepo;
	
	@Override
	public boolean chooseCity(String city) {
		// TODO Auto-generated method stub
		return customerRepo.getOne(city);
	}

	@Override
	public boolean bookMovieTicket(int TheaterId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancelMovieTicket(int ticketId) throws TicketCancellationException {
		// TODO Auto-generated method stub
		boolean flag = false;
		if (customerRepo.existsById(ticketId)) {
			// deleteTheatre = theatreRepo.findById(theatreId).get();
			customerRepo.deleteById(ticketId);
		} else {
			throw new TicketCancellationException("Cancellation Failed : ticketId not found");
		}
		return flag;

	}
	
	
	
	
	

}
