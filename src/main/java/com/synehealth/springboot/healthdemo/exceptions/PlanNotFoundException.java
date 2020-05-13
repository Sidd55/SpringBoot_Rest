package com.synehealth.springboot.healthdemo.exceptions;

public class PlanNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8130297311343232607L;
	
	public PlanNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public PlanNotFoundException(String arg0) {
		super(arg0);
	}
		

	public PlanNotFoundException(Throwable arg0) {
		super(arg0);
		
	}
	
	

}
