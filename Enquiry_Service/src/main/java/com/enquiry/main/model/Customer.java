package com.enquiry.main.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	
	@NotEmpty(message = "First name cannot be empty")
	@Size(min = 1, message = "First name must be at least 6 character long")
	private String firstName;
	
	@NotEmpty(message = "Last name cannot be empty")
	@Size(min = 1, message = "Last name must be at least 6 character long")
	private String lastName;
	
	@Min(value = 18, message = "Age should not be less than 21")
	@Max(value = 100, message = "Age should not be greater than 100")
	private int age;
	
	@NotEmpty(message = "Email cannot be empty")
	@Email(message = "Email should be valid")
	private String email;
	
	@Min(value = 10L, message = "Mobile number should be valid")
	private long mobileNo;
	
	@NotEmpty(message = "PAN card number cannot be empty")
	@Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}", message = "PAN card number should be valid")
	private String pancardNo;
	
	@Enumerated(EnumType.STRING)
	private EnquiryStatus enquiryStatus;
	
	@OneToOne(cascade = CascadeType.MERGE.DETACH.REMOVE.REFRESH)
	private Cibil cibilScore;

}
