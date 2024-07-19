package com.loan.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.loan.main.model.CustomerLoanApplication;
import com.loan.main.service.LoanService;

@RestController
public class LoanApplicationController {
	
	@Autowired private LoanService loanservice;
	
	@PostMapping("/saveLoanApplicationData")
	public ResponseEntity<CustomerLoanApplication> saveApplicantData(@RequestPart("loan") String userJson,
			                                                        @RequestPart(value="pan",required = false) MultipartFile pancard,
			                                                        @RequestPart(value = "adh",required = false) MultipartFile adharcard,
			                                                        @RequestPart(value = "pho",required = false) MultipartFile photos,
			                                                        @RequestPart(value = "sign",required = false) MultipartFile signatures)
	
	{
		CustomerLoanApplication cla=loanservice.saveLoanData(userJson,pancard, adharcard,photos, signatures);
		return new ResponseEntity<CustomerLoanApplication>(cla,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getAllApplicationData")
	public ResponseEntity<List<CustomerLoanApplication>> getAllData()
	{
		List<CustomerLoanApplication > ca= loanservice.getAllApplication();
		return new ResponseEntity<List<CustomerLoanApplication>>(ca,HttpStatus.ACCEPTED);
	}
	 
}
