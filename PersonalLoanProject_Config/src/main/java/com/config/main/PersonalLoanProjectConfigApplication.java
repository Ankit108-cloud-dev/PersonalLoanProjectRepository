package com.config.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigServer
public class PersonalLoanProjectConfigApplication {

	public static void main(String[] args) {
		
		System.out.println("This is Personal Loan Project Config Server");
		SpringApplication.run(PersonalLoanProjectConfigApplication.class, args);
	}

}
