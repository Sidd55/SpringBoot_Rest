package com.synehealth.springboot.healthdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.synehealth.springboot.healthdemo.entity.CustomErrorResponse;
import com.synehealth.springboot.healthdemo.exceptions.PlanNotFoundException;

@ControllerAdvice
public class PlanRestExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<CustomErrorResponse> handleException(PlanNotFoundException exc){
		
		CustomErrorResponse error = new CustomErrorResponse();
		
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler
	public ResponseEntity<CustomErrorResponse> handleException(Exception exc){
		
		CustomErrorResponse error = new CustomErrorResponse();
		
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exc.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
		
	}

}
