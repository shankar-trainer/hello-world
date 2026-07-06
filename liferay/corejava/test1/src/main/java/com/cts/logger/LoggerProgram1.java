package com.cts.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerProgram1 {

 static final Logger log=Logger.getLogger(LoggerProgram1.class.getName());

    public static void main(String[] args) {
log.info("info method");
log.log(Level.WARNING,"log warn  method");
log.log(Level.SEVERE,"log severe   method");

        log.info("start of the porgram");
        int n1=10;
        int n2=0;
        int division;

        try{
            log.log(Level.INFO,"division method called");
            division=n1/n2;
            log.log(Level.INFO,"division result is "+division);

        }
        catch (Exception e){
            log.log(Level.WARNING,"division error "+e);
        }

        log.info("end  of the porgram");


    }
}
