package com.cap.exceptions;

@SuppressWarnings("serial")
public class InvalidBookId extends Exception {
	public InvalidBookId(String error_msg) {
		super(error_msg);
	}
}