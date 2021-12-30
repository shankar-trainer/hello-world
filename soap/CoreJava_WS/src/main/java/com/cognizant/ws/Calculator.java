package com.cognizant.ws;
import javax.jws.WebService;
import javax.jws.soap.*;

@WebService
//(style=Style.RPC)
public interface Calculator {

	public int addition(int a, int b) ;
}
