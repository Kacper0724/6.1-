package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import java.util.*;

public class CollectionTestSuite {
    @BeforeEach
    public void beforeEach() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Test Case: end");
    }

    @DisplayName("This test checks if the list is empty.")

    @Test
    public void testOddNumbersExterminateEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing");
        //Then
        Assertions.assertEquals(listNumbers, emptyList);
    }

    @DisplayName("This test checks if the list has even numbers.")

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        Integer evenNumbers[] = new Integer[]{0, 2, 4, 6, 8};
        List<Integer>fillList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            fillList.add(i);
        }
        List<Integer>expectedList = new ArrayList<Integer>(Arrays.asList(evenNumbers));
        //When
        List<Integer>listNumbers = OddNumbersExterminator.exterminate(fillList);
        System.out.println("Testing: " + listNumbers);
        //Then
        Assertions.assertEquals(listNumbers, expectedList);
    }
}
