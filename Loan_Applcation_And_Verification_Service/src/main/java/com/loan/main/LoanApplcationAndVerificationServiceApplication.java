package com.loan.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class LoanApplcationAndVerificationServiceApplication {

	public static void main(String[] args) {
		System.out.println("This is loan application service ");
		SpringApplication.run(LoanApplcationAndVerificationServiceApplication.class, args);
	}

}
