package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    public static List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<Integer>();
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }
}
