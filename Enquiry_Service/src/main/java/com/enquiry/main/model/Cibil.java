package com.enquiry.main.model;

import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtCreation;

import org.hibernate.annotations.CreationTimestamp;
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
	@CreationTimestamp
	private LocalDateTime cibilScoreDateTime;
	private String status;
	private String cibilRemark;
}
