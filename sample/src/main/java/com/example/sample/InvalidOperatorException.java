package com.example.sample;

import java.util.Scanner;

public class InvalidOperatorException extends RuntimeException {

    public InvalidOperatorException() {
        super("Invalid operator. You need to choose one among (+, -, *, /)");
    }
}
