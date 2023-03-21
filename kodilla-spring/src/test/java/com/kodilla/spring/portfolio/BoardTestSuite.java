package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("Make a paper airplane");
        board.getInProgressList().addTask("Boil the water");
        board.getDoneList().addTask("Snooze");

        String toDoTask = board.getToDoList().getTasksList().get(0);
        String inProgressTask = board.getInProgressList().getTasksList().get(0);
        String doneTask = board.getDoneList().getTasksList().get(0);
        //Then
        assertEquals("Make a paper airplane", toDoTask);
        assertEquals("Boil the water", inProgressTask);
        assertEquals("Snooze", doneTask);
    }
}
