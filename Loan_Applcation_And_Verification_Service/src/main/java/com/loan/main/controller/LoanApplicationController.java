package com.loan.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.main.model.CustomerLoanApplication;
import com.loan.main.service.LoanService;

@RestController
public class LoanApplicationController {
	
	@Autowired private LoanService loanservice;
	
	
}
