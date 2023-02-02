package com.kodilla.rps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RpsTestSuite {
    RpsGame rpsGame = new RpsGame();
    @Test
    public void testCheckWireScore() {
        int result1 = rpsGame.gameRules(1, 2);
        int result2 = rpsGame.gameRules(2, 3);
        int result3 = rpsGame.gameRules(3, 1);

        int result4 = rpsGame.gameRules(1, 3);
        int result5 = rpsGame.gameRules(2, 1);
        int result6 = rpsGame.gameRules(3, 2);

        int result7 = rpsGame.gameRules(1, 1);

        assertEquals(2, result1);
        assertEquals(3, result2);
        assertEquals(1, result3);

        assertEquals(1, result4);
        assertEquals(2, result5);
        assertEquals(3, result6);

        assertEquals(0, result7);
    }
}
