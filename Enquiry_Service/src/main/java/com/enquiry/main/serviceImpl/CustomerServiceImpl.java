package com.enquiry.main.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;

import com.enquiry.main.exception.InvalidId;
import com.enquiry.main.model.Cibil;
import com.enquiry.main.model.Customer;
import com.enquiry.main.model.EnquiryStatus;
import com.enquiry.main.repository.CustomerRepository;
import com.enquiry.main.service.CustomerService;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	@Autowired private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomerData(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllEnquiry() {
		List<Customer> al =  customerRepository.findAll(Sort.by(Sort.Direction.ASC,"firstName"));
		return (List) al;
	}

	@Override
	public List<Customer> getEnquiryStatus(EnquiryStatus enquiryStatus) {
		return customerRepository.findAllByEnquiryStatus(enquiryStatus);
	}

	@Override
	public String updateCustomerDetails(Customer customer, int customerId) {
		  Optional<Customer> optionalCustomer = customerRepository.findById(customerId);

		    if (optionalCustomer.isPresent()) {
		        Customer originalCustomer = optionalCustomer.get();
		        
		        originalCustomer.setFirstName(customer.getFirstName());
		        originalCustomer.setLastName(customer.getLastName());
		        originalCustomer.setAge(customer.getAge());
		        originalCustomer.setEmail(customer.getEmail());
		        originalCustomer.setMobileNo(customer.getMobileNo()); 
		        originalCustomer.setPancardNo(customer.getPancardNo());
		        
		      
		        customerRepository.save(originalCustomer);
		        
		        return "Customer Details Updated Successfully!!!!";
		    }
		    else
		    {
		        throw new InvalidId("Customer ID is not available!!!!!");
		    }
	}

	@Override
	public String updateEnquiryStatus(Customer customer, int customerId, EnquiryStatus enquiryStatus) {
		  Optional<Customer> optionalCustomer = customerRepository.findByCustomerIdAndEnquiryStatus(customerId,enquiryStatus);
		  
		  
		if(optionalCustomer.isPresent()) {
			Customer originalCustomer = optionalCustomer.get();
			
			    originalCustomer.setFirstName(customer.getFirstName());
		        originalCustomer.setLastName(customer.getLastName());
		        originalCustomer.setAge(customer.getAge());
		        originalCustomer.setEmail(customer.getEmail());
		        originalCustomer.setMobileNo(customer.getMobileNo()); 
		        originalCustomer.setPancardNo(customer.getPancardNo());
		        originalCustomer.setEnquiryStatus(customer.getEnquiryStatus());
		        
                 customerRepository.save(originalCustomer);
		        
		        return "Customer Details And Enquiry Updated Successfully!!!!";
			
		}
		 else
	   {
		        throw new InvalidId("Customer ID is not available!!!!!");
	   }
	}

	@Override
	public Customer updateCibilData(int customerId) {
		
		Optional<Customer> cID = customerRepository.findAllByCustomerId(customerId);
		Customer cust=cID.get();
		if(cID.isPresent()) {
			Cibil cibilScore = cID.get().getCibilScore();
			
			
				Random random = new Random();
				int cbil = 300+random.nextInt(600);
				
				if (cibilScore == null) {
					cibilScore = new Cibil();

					cibilScore.setCibilScore(cbil);
					cust.setCibilScore(cibilScore);
					
				}

				if(cbil<=550) {
					cibilScore.setStatus("Poor");
					cibilScore.setCibilRemark("Poor Cibil Score");
				}
				if(cbil>550&&cbil<=750) {
					cibilScore.setStatus("Good");
					cibilScore.setCibilRemark("Good Cibil Score");

				}
				if(cbil>750) {
					cibilScore.setStatus("Excellent");
					cibilScore.setCibilRemark("Excellent Cibil Score");

				}
				}

          return  customerRepository.save(cust);
      
	}

	@Override
	public List<Customer> getCustomerDataByCibilStatus(String status) {
		
		List<Customer> cList =customerRepository.findAllByCibilScore_Status(status);
		
		return cList;
	}	

}
