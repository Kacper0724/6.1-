package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Display display;

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double resultAdd = calculator.add(2, 5);
        double resultSub = calculator.sub(3.5, 1.5);
        double resultMul = calculator.mul(2, 2);
        double resultDiv = calculator.div(2, 2);
        //Then
        assertEquals(7, resultAdd);
        assertEquals(2, resultSub);
        assertEquals(4, resultMul);
        assertEquals(1, resultDiv);
    }
}
