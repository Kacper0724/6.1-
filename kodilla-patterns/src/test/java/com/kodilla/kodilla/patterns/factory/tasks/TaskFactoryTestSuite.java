package com.kodilla.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
        //Then
        assertEquals("Grocery", shoppingTask.getTaskName());
        assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingFactory = factory.makeTask(TaskFactory.PAINTINGTASK);
        paintingFactory.executeTask();
        //Then
        assertEquals("Flat Wall", paintingFactory.getTaskName());
        assertEquals(true, paintingFactory.isTaskExecuted());
    }

    @Test
    void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        //Then
        assertEquals("Road to Warsaw", drivingTask.getTaskName());
        assertEquals(true, drivingTask.isTaskExecuted());
    }
}
