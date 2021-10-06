package org.com.pl;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Addition {
	static Logger logger = Logger.getLogger(LoggerApp1.class);

	public static void main(String[] args) {
		//BasicConfigurator.configure();
         PropertyConfigurator.configure("log4j.properties");
		Scanner scanner = new Scanner(System.in);

		try {
			int x, y, z;

			System.out.println("Enter first  number");
			x = scanner.nextInt();

			if (x <= 0)
				logger.debug(x + " is <=0");
			else
				logger.info(x + " is correct");

			System.out.println("Enter second number");
			y = scanner.nextInt();

			if (y <= 0)
				logger.debug(y + " is <=0");
			else
				logger.info(y + " is correct");

			z = x + y;
			System.out.println("sum is " + z);
		} catch (InputMismatchException e) {
			logger.error(e);
		}

	}
}
