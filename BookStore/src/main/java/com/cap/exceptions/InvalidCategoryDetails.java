package com.cap.exceptions;

@SuppressWarnings("serial")
public class InvalidCategoryDetails extends Exception {
	public InvalidCategoryDetails(String error_msg) {
		super(error_msg);
	}
}
