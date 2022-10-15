package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer15102022Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer15102022Application.class, args);
	}

}
