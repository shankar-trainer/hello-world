package cts.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication

//http://localhost:8888/config-client/default

public class CloudServer {

	public static void main(String[] args) {
		SpringApplication.run(CloudServer.class, args);
	}
}
