package com.kodilla.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigMacTestSuite {
    @Test
    void testBigMacNew() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Sesame")
                .burgers(2)
                .sauce("Spicy")
                .ingredient("Cheese")
                .ingredient("Onion")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        assertEquals("Sesame", bigMac.getBun());
        assertEquals(2, bigMac.getBurgers());
        assertEquals("Spicy", bigMac.getSauce());
        assertEquals("Cheese", bigMac.getIngredients().get(0));
        assertEquals("Onion", bigMac.getIngredients().get(1));
        assertEquals(2, howManyIngredients);
    }
}
