package com.bridgelabz;

public class Handling {
    public int divide(int a,int b) {
        if(b==0){
            throw new ArithmeticException("Invalid divisor");
        }
        return (a/b);
    }
}
