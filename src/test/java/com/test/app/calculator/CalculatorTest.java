package com.test.app.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        double x = 1, y = 2;
        double expected = 3;
        double result = calculator.add(x, y);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void subTest() {
        double x = 5, y = 2;
        double expected = 3;
        double result = calculator.sub(x, y);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void mulTest() {
        double x = 5, y = 2;
        double expected = 10;
        double result = calculator.mul(x, y);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void divTest() {
        double x = 10, y = 2;
        double expected = 5;
        double result = calculator.div(x, y);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testNull(){
        double x = 5; Double y = null;
        double expected = 5;
        double result = calculator.div(x,y);
        Assertions.assertEquals(expected, result);
    }

}
