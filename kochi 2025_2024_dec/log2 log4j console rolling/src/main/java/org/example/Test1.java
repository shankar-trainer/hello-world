package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test1 {

    static Logger log= LogManager.getLogger(Test1.class);

    public static void main(String[] args) {
        System.out.println("hello ");
		log.debug("hello");

		int i = 3;

		if (i > 4) {
			log.debug("success debug object is present");
			log.info("success info object is present");
		} else {
			log.error("error error object is not present");
			log.fatal("error fatal object is not present");
		}    }
}
