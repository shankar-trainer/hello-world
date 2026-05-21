package com.cts.logger;

import org.apache.logging.log4j.*;

import java.util.Scanner;

public class InterestCalculation {
    private float amt;
    private int time;
    private float rate;

    private static Logger logger = LogManager.getLogger(InterestCalculation.class);

    Scanner scanner;

    InterestCalculation() {
        scanner = new Scanner(System.in);
    }

    float calc() throws Exception {
        logger.info("interest calculation starts");
        System.out.println("enter amount ");
        amt = scanner.nextFloat();

        if (amt <= 0) {
            logger.error("invalid amount");
            throw new Exception("invalid amount");
        }

        System.out.println("enter  rate ");
        rate = scanner.nextFloat();
        if (rate <= 0) {
            logger.error("invalid rate");
            throw new Exception("invalid rate");
        }
        System.out.println("enter time");
        time = scanner.nextInt();

        logger.debug("amount is "+time);
        logger.debug("rate is "+rate);
        logger.debug("time is "+time);
        if (time <= 0) {
            logger.error("invalid time");
            throw new Exception("invalid time");
        } else {
            return amt * rate * time / 100;
        }
    }

    public static void main(String[] args) {
        logger.info("program starts");
        try {
            System.out.println(" interest is" + new InterestCalculation().calc());
        } catch (Exception e) {
            logger.error(e.getMessage());
            System.err.println(e.getMessage());
        }
        logger.info("program ends");
    }
}
