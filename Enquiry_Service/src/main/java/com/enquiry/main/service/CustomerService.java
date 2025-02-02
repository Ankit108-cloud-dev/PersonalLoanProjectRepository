package com.enquiry.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.enquiry.main.model.Customer;
import com.enquiry.main.model.EnquiryStatus;

public interface CustomerService {

	public Customer saveCustomerData(Customer customer);

	public List<Customer> getAllEnquiry();

	public List<Customer> getEnquiryStatus(EnquiryStatus enquiryStatus);

	public String updateCustomerDetails(Customer customer, int customerId);

	public String updateEnquiryStatus(Customer customer, int customerId, EnquiryStatus enquiryStatus);

	public Customer updateCibilData(int customerId);

	public List<Customer> getCustomerDataByCibilStatus(String status);

	public ResponseEntity<String> sendEmail(int customerId);


}
