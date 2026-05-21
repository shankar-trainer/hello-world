package com.cts.logger;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerPrg2 {

static final Logger logger= LogManager.getLogger(LoggerPrg2.class);

    public static void main(String[] args) {

        logger.info("this is info method");

        logger.debug("this is debug method");
        logger.warn("this is warn method");
        logger.error("this is error method");
        logger.trace("this is trace method");

        logger.log(Level.TRACE,"this is logger");
        logger.log(Level.INFO,"this is logger");
    }
}
