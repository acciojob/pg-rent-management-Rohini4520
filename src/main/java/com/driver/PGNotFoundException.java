package com.driver;

public class PGNotFoundException extends RuntimeException {
	public PGNotFoundException(String message) {
        super(message);
    }
}
