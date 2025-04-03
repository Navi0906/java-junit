package com.bridgelabz;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {
    @Test
    public void twoPlusTwo(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void threePlusTwo(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(3,2));
    }

    @Test
    public void twoPlusFour(){
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.add(2,4));
    }

    @Test
    public void twoMinusFour(){
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.subtract(2,4));
    }

    @Test
    public void twoMinusTwo(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(2,2));
    }

    @Test
    public void twoMutiplyFour(){
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.multiply(2,4));
    }

    @Test
    public void twoMultiplytwo(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiply(2,2));
    }

    @Test
    public void fourDivideTwo(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(4,2));
    }

    @Test
    public void tenDivideZero(){
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class,
                () -> {calculator.divide(10,0);});

    }

}
