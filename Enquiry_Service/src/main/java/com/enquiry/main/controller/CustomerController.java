package com.enquiry.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enquiry.main.model.Customer;
import com.enquiry.main.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired private CustomerService customerService;
	
	@PostMapping("/saveCustomerEnquiry")
	public ResponseEntity<Customer> saveEnquiryData(@RequestBody Customer customer){
		
		Customer customer2=customerService.saveCustomerData(customer);
		
		return new ResponseEntity<Customer>(customer2, HttpStatus.CREATED);
	}
	
	

}
