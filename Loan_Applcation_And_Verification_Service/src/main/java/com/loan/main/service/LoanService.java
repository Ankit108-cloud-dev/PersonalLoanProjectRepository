package com.loan.main.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.loan.main.controller.LoanApplicationController;
import com.loan.main.model.CustomerLoanApplication;

public interface LoanService {

	 public CustomerLoanApplication saveLoanData(String userJson, MultipartFile pancard, MultipartFile addharcard,
			MultipartFile photos, MultipartFile signatures);

	public List<CustomerLoanApplication> getAllApplication();

	

	
}
