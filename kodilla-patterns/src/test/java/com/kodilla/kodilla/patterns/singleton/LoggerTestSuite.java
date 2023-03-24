package com.kodilla.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void addLog() {
        logger = Logger.INSTANCE;
        logger.log("First test log");
    }

    @Test
    void testGetLog() {
        //Given
        //When
        String log = logger.getLastLog();
        //Then
        assertEquals("First test log", log);
    }
}
