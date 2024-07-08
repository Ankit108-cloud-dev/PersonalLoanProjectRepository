package com.enquiry.main.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.enquiry.main.model.Customer;
import com.enquiry.main.model.EnquiryStatus;
import com.enquiry.main.service.CustomerService;

import jakarta.persistence.Enumerated;

@RestController
public class CustomerController {
	
	@Autowired private CustomerService customerService;
	
	@PostMapping("/saveCustomerEnquiry")
	public ResponseEntity<Customer> saveEnquiryData(@RequestBody Customer customer){
		
		Customer customer2=customerService.saveCustomerData(customer);
		
		return new ResponseEntity<Customer>(customer2, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllEnquiry")
	public ResponseEntity<List<Customer>> getAllEnquiry()
	{
		List<Customer> customer1 = customerService.getAllEnquiry();
		return new ResponseEntity<List<Customer>>(customer1,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getEnquiryStatus/{enquiryStatus}")
	public ResponseEntity<List<Customer>> getEnquiryByStatus(@PathVariable EnquiryStatus enquiryStatus)
	{
		List<Customer> al = customerService.getEnquiryStatus(enquiryStatus);
		
		return new ResponseEntity<List<Customer>>(al,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update_customerDetails/{customerId}")
	public ResponseEntity<String> updateCustomerDetails(@RequestBody Customer customer, @PathVariable int customerId)
	{
		String customer1 = customerService.updateCustomerDetails(customer,customerId);
		return new ResponseEntity<String>(customer1,HttpStatus.ACCEPTED);
	}
	
	@PatchMapping("/updat_enquiryStatus/{customerId}/{enquiryStatus}")
	public ResponseEntity<String> updateCustomerIdAndEnquiryStatus(@RequestBody Customer customer,@PathVariable int customerId,@PathVariable EnquiryStatus enquiryStatus)
	{
		String message = customerService.updateEnquiryStatus(customer,customerId,enquiryStatus);
		return new ResponseEntity<String>(message,HttpStatus.ACCEPTED);
	}
	

}