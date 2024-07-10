package com.enquiry.main.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.enquiry.main.model.Customer;
import com.enquiry.main.model.EnquiryStatus;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

	public List findAll(Sort by);

	public List<Customer> findAllByEnquiryStatus(EnquiryStatus enquiryStatus);

	public Optional<Customer> findByCustomerIdAndEnquiryStatus(int customerId, EnquiryStatus e);

	public Optional<Customer> findAllByCustomerId(int customerId);

	public List<Customer> findAllByCibilScore_Status(String status);


}
