package com.loan.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
	
	@Lob
	@Column(length = 999999999)
	private byte[] panCard;
	
	@Column(length = 999999999)
	private byte[] adharCard;
	
	@Column(length = 999999999)
	private byte[] photo;
	
	@Column(length = 999999999)
	private byte[] signature;
	

}
