package com.example.sample;

public class BadRequestException extends RuntimeException {

    public BadRequestException() {
        super("Invalid input size. You must input 3 arguments");
    }
}
