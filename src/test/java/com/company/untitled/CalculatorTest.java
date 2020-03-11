package com.company.untitled;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Test
    public void constructorTest() {
        calculator = new Calculator(4, 5);
        assertEquals(9, calculator.sum());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorExceptionTest() {
        calculator = new Calculator(-4, 5);
    }
}