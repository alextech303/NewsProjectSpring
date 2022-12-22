package com.alextech.main.dao;

public class NewsDaoException extends Exception {
	
	public NewsDaoException(String message) {
		super(message);
	}

	public NewsDaoException(String message, Exception exception) {
		super(message, exception);
	}

	public NewsDaoException(Exception message) {
		super(message);
	}

}
