package com.enquiry.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.enquiry.main.model.Customer;
import com.enquiry.main.model.EnquiryStatus;

public interface CustomerService {

	public Customer saveCustomerData(Customer customer);

	public List<Customer> getAllEnquiry();

	public List<Customer> getEnquiryStatus(EnquiryStatus enquiryStatus);

	public String updateCustomerDetails(Customer customer, int customerId);

	public String updateEnquiryStatus(Customer customer, int customerId, EnquiryStatus enquiryStatus);

}
