package com.petland.register.exception;

public class AnimalAlreadyExistsException extends RuntimeException {
    public AnimalAlreadyExistsException(String message) {
        super(message);
    }
}
