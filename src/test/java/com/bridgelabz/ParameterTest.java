package com.bridgelabz;


import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class ParameterTest {

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8})
    void testEvenNumbers(int num){
        Parameterized para = new Parameterized();
        assertTrue(para.isEven(num));
    }

}
