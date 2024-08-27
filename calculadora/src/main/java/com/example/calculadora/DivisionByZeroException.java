package com.example.calculadora;

public class DivisionByZeroException extends Exception{
    
    public DivisionByZeroException(String msg) {
        super(msg);
    }
}
