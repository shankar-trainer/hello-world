package cts.com;

import org.slf4j.Logger
;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient

public class MainApp {
	
	static Logger logger=LoggerFactory.getLogger(MainApp.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	   logger.info("this is info from  "+MainApp.class.getName());
	   logger.warn("this is warning  from"+MainApp.class.getName());
	   logger.error("this is error  from "+MainApp.class.getName());
	}
}
