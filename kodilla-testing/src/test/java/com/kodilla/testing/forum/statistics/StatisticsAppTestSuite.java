package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.StatisticsApp;
import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class StatisticsAppTestSuite {
    private static int testCount = 0;


    @BeforeAll
    public static void BeforeAll() {
        System.out.println("Beginning of tests.");
    }

    @AfterAll
    public static void AfterAll() {
        System.out.println("End of tests.");
    }

    @BeforeEach
    public void BeforeEach() {
        testCount++;
        System.out.println("Preparing to execute test #" + testCount);
    }

    private List<String> generateUser(int userQuantity) {
        List<String> user = new ArrayList<>();
        for (int n = 1; n <= userQuantity; n++){
            user.add("Name" + n);
        }
        return user;
    }

    @Mock
    private Statistics statisticsMock;

    @Test
    public void testCalculateAdvStatisticsIfPostsNumbers0() {
        //Given
        List<String> userNames = generateUser(2);
        when(statisticsMock.userName()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsApp statisticsApp = new StatisticsApp();
        //When
        statisticsApp.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, statisticsApp.posts);
    }

    @Test
    public void testCalculateAdvStatisticsIfPostsNumbers1000() {
        //Given
        List<String> userNames = generateUser(2);
        when(statisticsMock.userName()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsApp statisticsApp = new StatisticsApp();
        //When
        statisticsApp.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, statisticsApp.posts);
    }

    @Test
    public void testCalculateAdvStatisticsIfCommentsNumbers0() {
        //Given
        List<String> userNames = generateUser(2);
        when(statisticsMock.userName()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsApp statisticsApp = new StatisticsApp();
        //When
        statisticsApp.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, statisticsApp.comments);
    }

    @Test
    public void testCalculateAdvStatisticsIfCommentsNumbersLowerThanPosts() {
        //Given
        List<String> userNames = generateUser(2);
        when(statisticsMock.userName()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(5);
        StatisticsApp statisticsApp = new StatisticsApp();
        //When
        statisticsApp.calculateAdvStatistics(statisticsMock);
        //Then
        assertTrue(statisticsApp.comments < statisticsApp.posts);
    }

    @Test
    public void testCalculateAdvStatisticsIfCommentsNumbersHigherThanPosts() {
        //Given
        List<String> userNames = generateUser(2);
        when(statisticsMock.userName()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);
        StatisticsApp statisticsApp = new StatisticsApp();
        //When
        statisticsApp.calculateAdvStatistics(statisticsMock);
        //Then
        assertTrue(statisticsApp.comments > statisticsApp.posts);
    }

    @Test
    public void testCalculateAdvStatisticsIfUsersNumbers0() {
        //Given
        List<String> userNames = new ArrayList<>();
        when(statisticsMock.userName()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsApp statisticsApp = new StatisticsApp();
        //When
        statisticsApp.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, statisticsApp.users);
    }

    @Test
    public void testCalculateAdvStatisticsIfUsersNumbers100() {
        //Given
        List<String> userNames = generateUser(100);
        when(statisticsMock.userName()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsApp statisticsApp = new StatisticsApp();
        //When
        statisticsApp.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, statisticsApp.users);
    }
}
