package com.enquiry.main.model;

import org.springframework.boot.autoconfigure.condition.ConditionalOnJava.Range;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cibil {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cibilId;
	private int cibilScore;
	private String cibilScoreDateTime;
	private String status;
	private String cibilRemark;
}
