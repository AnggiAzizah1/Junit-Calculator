package com.me.calculator;

import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void testAddSucces(){

        int result = calculator.add(10, 10);
    }
}
