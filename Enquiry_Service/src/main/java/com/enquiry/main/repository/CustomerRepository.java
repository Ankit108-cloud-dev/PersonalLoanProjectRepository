package com.enquiry.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.enquiry.main.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
