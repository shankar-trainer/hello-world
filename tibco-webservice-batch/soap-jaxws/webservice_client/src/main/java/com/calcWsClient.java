package com;

import com.cts.webservice.Calculator;
import com.cts.webservice.CalculatorImplService;
import com.cts.webservice.DivisionException_Exception;

public class calcWsClient {

	public static void main(String[] args) {
		System.out.println("start ");
		CalculatorImplService service = new CalculatorImplService();
		Calculator calculator = service.getCalculatorImplPort();

		System.out.println(calculator.addition(11, 12));
		System.out.println(calculator.sub(11, 12));

		try {
			System.out.println(calculator.division(11, 12));
			System.out.println(calculator.division(11, 0));
		} catch (DivisionException_Exception e) {
			System.err.println(e.getMessage());
		}
System.out.println("end ");
	}
}
