package com.loan.main.serviceimpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.loan.main.controller.LoanApplicationController;
import com.loan.main.model.CustomerLoanApplication;
import com.loan.main.repository.LoanRepository;
import com.loan.main.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired private LoanRepository loanRepository;

	@Override
	public CustomerLoanApplication saveLoanData(String userJson, MultipartFile pancard, MultipartFile adharcard,
			MultipartFile photos, MultipartFile signatures) {
		
		ObjectMapper mapper=new ObjectMapper();
		CustomerLoanApplication cla=null; 
	try {
			cla=mapper.readValue(userJson, CustomerLoanApplication.class);
		
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
	
	    if(pancard !=null) 
	    {
	    	cla.getApd().setPanCard(pancard.getBytes());
	    }
	    if(adharcard !=null)
	    {
	    	cla.getApd().setAdharCard(adharcard.getBytes());
	    	
	    }
	    if(photos !=null)
	    {
	    	cla.getApd().setPhoto(photos.getBytes());
	    }
	    if(signatures !=null)
	    {
	    	cla.getApd().setSignature(signatures.getBytes());
	    }
	}catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		

	CustomerLoanApplication cust= loanRepository.save(cla);
	return cust;
	


	}

	@Override
	public List<CustomerLoanApplication> getAllApplication() {
		
		Iterable<CustomerLoanApplication> al =  loanRepository.findAll();
		return (List<CustomerLoanApplication>) al;
	}
}
