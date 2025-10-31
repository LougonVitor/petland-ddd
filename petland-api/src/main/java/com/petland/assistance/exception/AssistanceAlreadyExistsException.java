package com.petland.assistance.exception;

public class AssistanceAlreadyExistsException extends RuntimeException {
    public AssistanceAlreadyExistsException(String message) {
        super(message);
    }
}