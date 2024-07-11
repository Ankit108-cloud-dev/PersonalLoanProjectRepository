package com.loan.main.model;

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
public class AllPersonalDocuments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentID;
	private  byte[] addressProof;
	private byte[] panCard;
	private byte[] IncomeTax;
	private byte[] addharCard;
	private byte[] photo;
	private byte[] signature;
	private byte[] bankCheque;
	private byte[] salarySlips;
	

}
