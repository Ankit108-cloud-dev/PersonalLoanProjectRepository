package com.enquiry.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enquiry.main.model.Customer;
import com.enquiry.main.repository.CustomerRepository;
import com.enquiry.main.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	@Autowired private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomerData(Customer customer) {
		
		return customerRepository.save(customer);

	}
	

}
