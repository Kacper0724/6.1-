package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTest() {
        System.out.println("All tests are finished.");
    }

    @Nested
    @DisplayName("Figure method tests")
    class Figure {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(new Circle(1.5));
            //Then
            assertEquals(1, shapeCollector.getFigureList().size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(2);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            assertTrue(result);
            assertEquals(0, shapeCollector.getFigureList().size());
        }

        @Test
        void testGetFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(4);
            shapeCollector.addFigure(shape);
            //When
            Shape result = shapeCollector.getFigure(0);
            //Then
            assertEquals(shape, result);
        }

        @Test
        void testShowFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(4));
            shapeCollector.addFigure(new Circle(5));
            //When
            String result = shapeCollector.showFigures();
            //Then
            assertEquals("CircleCircle", result);
        }
    }
}
