package com.amdocs.restapidemo1.exception;

public class RecordNotFoundException extends Exception {

	public RecordNotFoundException(String message) {
		
		System.out.println(message);
	}
}
