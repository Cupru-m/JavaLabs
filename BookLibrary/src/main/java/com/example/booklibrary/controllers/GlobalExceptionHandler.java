package com.example.booklibrary.controllers;


import com.example.booklibrary.exceptions.BookListEmptyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    
    @ExceptionHandler(BookListEmptyException.class)
    public ResponseEntity<String> handleBookListEmptyException(BookListEmptyException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}