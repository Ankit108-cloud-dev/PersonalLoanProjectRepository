package com.loan.main.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentLoanDetails {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int currentloanId;
	private int currentloanNo;
	
	private double loanAmount;
	private int rateOfInterest;
	private int tenure;
	private double totalAmmountToBePaid;
	private int processingFees;
	private double totalInterest;
	private String sanctionDate;
	private String remark;
	private String status;
	

}
