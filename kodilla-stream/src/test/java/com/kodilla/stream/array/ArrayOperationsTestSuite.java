package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //Given
        Random generator = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextInt(100);
        }
        //When
        double expected = 0;
        for (int i = 0; i < arr.length; i++) {
            expected += arr[i];
        }

        expected /= arr.length;

        double result = ArrayOperations.getAverage(arr);
        System.out.println("Average is: " + expected);
        //Then
        assertEquals(expected, result);
    }
}
