package com.pragma.mutation;


public class Calculator {

    public int add(int numberA, int NumberB) {
        return numberA +NumberB;
    }

    public int subtract(int numberA, int NumberB) {
        return numberA - NumberB;
    }

    public int multiply(int numberA, int NumberB) {
        return numberA * NumberB;
    }

    public int divide(int numberA, int numberB) {
        if (numberB == 0) {
            throw new CalculatorException("Division by zero is not allowed");
        }
        return numberA / numberB;
    }
}