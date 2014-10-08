package com.dil.springmvc;

public class StudentExceptionHandler extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String exceptionMessage;

	public StudentExceptionHandler(String exceptionMsg) {
		this.exceptionMessage = exceptionMsg;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	
}
