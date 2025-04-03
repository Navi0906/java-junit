package com.bridgelabz;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionHandingTest {
    @Test
    public void tenDivideZero(){
        Handling handle = new Handling();
        assertThrows(ArithmeticException.class,
                () -> {handle.divide(10,0);});

    }
}
