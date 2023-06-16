package com.in28minutes.microservices.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;



//http://localhost:8888/abc/qa
//http://localhost:8888/limit/qa


//http://localhost:8888/limits-service/default
//http://localhost:8888/limits-service/dev
//http://localhost:8888/limits-service/qa


@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}
}



//C:/test/git-localconfig-repo/
//create dir C:/test/git-localconfig-repo/
// git init 
//add all .properties files
//git add *
//git commit -m "commit"
