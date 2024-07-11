package com.loan.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loan.main.model.CustomerLoanApplication;

@Repository
public interface LoanRepository extends CrudRepository<CustomerLoanApplication, Integer> 
{

}
