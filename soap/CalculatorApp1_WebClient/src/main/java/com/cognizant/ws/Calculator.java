package com.cognizant.ws;

import javax.jws.*;
import javax.jws.soap.*;

@WebService
public interface Calculator {
	int addition(int a, int b);

	int subtraction(int a, int b);

	int multiplicaation(int a, int b);

	int division(int a, int b);

}
