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


}
