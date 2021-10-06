package com.cg.services;

import com.cg.exceptions.TicketCancellationException; 

public interface ICustomerService {
	
	public boolean chooseCity(String city);
	public boolean bookMovieTicket(int TheaterId);
	public boolean cancelMovieTicket(int TicketId) throws TicketCancellationException;

}
