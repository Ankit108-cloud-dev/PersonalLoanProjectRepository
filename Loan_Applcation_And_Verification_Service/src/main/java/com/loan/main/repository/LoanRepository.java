package com.loan.main.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loan.main.model.CustomerLoanApplication;

@Repository
public interface LoanRepository extends CrudRepository<CustomerLoanApplication, Integer> 
{

 public 	List<CustomerLoanApplication> findAll(Sort by);

}
