package com.greatlearning.main;

public class UserException extends Exception {
	
	String message;
	
	public UserException() {
		// TODO Auto-generated constructor stub
	}
	
	UserException(String message){
		this.message = message;
	}
	
}
