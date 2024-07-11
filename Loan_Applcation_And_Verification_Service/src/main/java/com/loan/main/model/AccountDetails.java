package com.loan.main.model;

import org.springframework.boot.autoconfigure.batch.BatchTransactionManager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;
	private String accounType;
	private double accountBalance;
	private String accountHolderName;
	private String accountStatus;
	private long accountNumber;
	

}
