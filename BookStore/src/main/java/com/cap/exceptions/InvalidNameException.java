package com.cap.exceptions;

@SuppressWarnings("serial")
public class InvalidNameException extends Exception {
	public InvalidNameException(String error_msg) {
		super(error_msg);
	}
}