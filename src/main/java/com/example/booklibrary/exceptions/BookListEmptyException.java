package com.example.booklibrary.exceptions;

public class BookListEmptyException extends RuntimeException
{
    public BookListEmptyException(String message) {
        super(message);
    }
}
