package com.loan.main.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustomerLoanApplication {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int customerId;
	private String  customerName;
	private String customerDOB;
	private int customerAge;
	private int requiredTenure;
	private String customerGender;
	private String customerEmial;
	private long customerMobileNumber;
	private long customerAdditionalMobileNumber;
	private double customerTotalLoanRequired;
	private String remark;

	private enum loanStatus{
		IN_PROGRESS,
		APPROVED,
		REJECTED,
		CLOSED,

	}
	
	@OneToOne(cascade = CascadeType.MERGE.DETACH.REMOVE.REFRESH)
	private CibilScore cs;;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AllPersonalDocuments apd;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress ca;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CurrentLoanDetails cld;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoan pl;
	
	@OneToOne (cascade = CascadeType.ALL)
	private AccountDetails ad;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails gd;
	
	@OneToOne(cascade = CascadeType.MERGE.DETACH.REMOVE.REFRESH)
	private LoanDisbursement ld;
	
	@OneToMany(cascade = CascadeType.MERGE.DETACH.REMOVE.REFRESH)
	private Set<Ledger> ledger;
	
	@OneToOne (cascade = CascadeType.MERGE.DETACH.REMOVE.REFRESH)
	private SanctionLetter sl;
	
	
	
	
	

}
