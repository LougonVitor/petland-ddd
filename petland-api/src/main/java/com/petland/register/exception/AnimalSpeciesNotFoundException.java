package com.petland.register.exception;

public class AnimalSpeciesNotFoundException extends RuntimeException{
    public AnimalSpeciesNotFoundException(String message) {
        super(message);
    }
}