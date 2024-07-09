package com.enquiry.main.exception_response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.enquiry.main.exception.InvalidId;

import jakarta.validation.ConstraintViolationException;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	@ExceptionHandler(InvalidId.class)
	public ResponseEntity<String> handleInvalidIdException(InvalidId invalidId)
	{
		return new ResponseEntity<String>(invalidId.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map> excep(MethodArgumentNotValidException m)
	{
		Map<String, String> errors=new HashMap<>();
		m.getBindingResult().getFieldErrors().forEach(error->{
		String property=	error.getField();
		String message=     error.getDefaultMessage();
			errors.put(property, message);
		});
		return  new ResponseEntity<Map>(errors,HttpStatus.BAD_REQUEST);
	}

}
