package com.cap.exceptions;

@SuppressWarnings("serial")
public class InvalidCategoryId extends Exception {
	public InvalidCategoryId(String error_msg) {
		super(error_msg);
	}
}
