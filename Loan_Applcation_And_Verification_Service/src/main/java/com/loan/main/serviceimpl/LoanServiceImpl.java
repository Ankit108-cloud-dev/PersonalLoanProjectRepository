package com.loan.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.main.controller.LoanApplicationController;
import com.loan.main.model.CustomerLoanApplication;
import com.loan.main.repository.LoanRepository;
import com.loan.main.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired private LoanRepository loanRepository;

	
	
	

}
