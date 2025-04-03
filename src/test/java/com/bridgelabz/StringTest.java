package com.bridgelabz;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class StringTest {

    @Test
    public void checkForDog(){
        StringUtils test = new StringUtils();
        assertEquals("god",test.reverseStr("dog"));
    }

    @Test
    public void checkForCar(){
        StringUtils test = new StringUtils();
        assertEquals("rac",test.reverseStr("car"));
    }

    @Test
    public void checkForPalin(){
        StringUtils test = new StringUtils();
        assertTrue(test.isPalindrome("racecar"));
    }

    @Test
    public void checkForPali(){
        StringUtils test = new StringUtils();
        assertFalse(test.isPalindrome("okay"));
    }

    @Test
    public void carToCAR(){
        StringUtils test = new StringUtils();
        assertEquals("CAR",test.toUpper("car"));
    }

    @Test
    public void shotToSHOT(){
        StringUtils test = new StringUtils();
        assertEquals("SHOT",test.toUpper("shot"));
    }


}
