package com.petland.advice;

import com.petland.register.exception.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(AnimalNotFoundException.class)
    public ResponseEntity<String> handleAnimalNotFound(AnimalNotFoundException ex) {
        System.err.println("Error: Animal not found - " + ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(AnimalSpeciesNotFoundException.class)
    public ResponseEntity<String> handleAnimalSpeciesNotFound(AnimalSpeciesNotFoundException ex) {
        System.err.println("Error: Animal species not found - " + ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericException(Exception ex) {
        System.err.println("An unexpected error occurred: " + ex.getMessage());
        ex.printStackTrace();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An internal server error occurred: " + ex.getMessage());
    }
}