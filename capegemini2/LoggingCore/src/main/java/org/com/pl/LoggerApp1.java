package org.com.pl;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LoggerApp1 {

	static Logger logger = Logger.getLogger(LoggerApp1.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		System.out.println("User Info");
		logger.info("user informartion");
		logger.warn("user warning");
		logger.debug("user debugging");
		logger.error("user error");
		logger.fatal("user fatal error");
		logger.trace("user tracing");

	}
}
