package com.enquiry.main;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class EnquiryServiceApplication {

	public static void main(String[] args) {
		
		System.out.println("This is Enquiry Service");
		SpringApplication.run(EnquiryServiceApplication.class, args);
	}

}
