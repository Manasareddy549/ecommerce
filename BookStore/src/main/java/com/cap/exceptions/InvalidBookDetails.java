package com.cap.exceptions;

@SuppressWarnings("serial")
public class InvalidBookDetails extends Exception {
	public InvalidBookDetails(String error_msg) {
		super(error_msg);
	}

}