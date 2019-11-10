package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticTests {

    @Test
    public void testCalculateNullPost() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfPost = 0;
        int numberOfComments = 100;
        List<String> myUsers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            myUsers.add("a" + i);
        }
        when(statisticsMock.postCount()).thenReturn(numberOfPost);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.usersNames()).thenReturn(myUsers);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //Then
        calculateStatistics.CalculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, calculateStatistics.getNumberOfPosts());
        Assert.assertEquals(1000, calculateStatistics.getNumbersOfUsers());
        Assert.assertEquals(100, calculateStatistics.getNumberOfComments());
        Assert.assertEquals(0, calculateStatistics.getAvrPosts(), 0.01);
        Assert.assertEquals(0.1, calculateStatistics.getAvrComments(),0.01);
        Assert.assertEquals(0, calculateStatistics.getAvrCommToPost(), 0.01);

    }
    @Test
    public void testCalculate1000Post() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfPost = 1000;
        int numberOfComments = 100;
        List<String> myUsers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            myUsers.add("a" + i);
        }
        when(statisticsMock.postCount()).thenReturn(numberOfPost);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.usersNames()).thenReturn(myUsers);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //Then
        calculateStatistics.CalculateAdvStatistics(statisticsMock);

        Assert.assertEquals(1000, calculateStatistics.getNumberOfPosts());
        Assert.assertEquals(1000, calculateStatistics.getNumbersOfUsers());
        Assert.assertEquals(100, calculateStatistics.getNumberOfComments());
        Assert.assertEquals(1, calculateStatistics.getAvrPosts(), 0.01);
        Assert.assertEquals(0.1, calculateStatistics.getAvrComments(),0.01);
        Assert.assertEquals(0.1, calculateStatistics.getAvrCommToPost(), 0.01);

    }
    @Test
    public void testCalculateNullComm() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfPost = 1000;
        int numberOfComments = 0;
        List<String> myUsers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            myUsers.add("a" + i);
        }
        when(statisticsMock.postCount()).thenReturn(numberOfPost);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.usersNames()).thenReturn(myUsers);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //Then
        calculateStatistics.CalculateAdvStatistics(statisticsMock);

        Assert.assertEquals(1000, calculateStatistics.getNumberOfPosts());
        Assert.assertEquals(1000, calculateStatistics.getNumbersOfUsers());
        Assert.assertEquals(0, calculateStatistics.getNumberOfComments());
        Assert.assertEquals(1, calculateStatistics.getAvrPosts(), 0.01);
        Assert.assertEquals(0, calculateStatistics.getAvrComments(),0.01);
        Assert.assertEquals(0, calculateStatistics.getAvrCommToPost(), 0.01);

    }
    @Test
    public void testCalculateMoreComm() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfPost = 1000;
        int numberOfComments = 2000;
        List<String> myUsers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            myUsers.add("a" + i);
        }
        when(statisticsMock.postCount()).thenReturn(numberOfPost);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.usersNames()).thenReturn(myUsers);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //Then
        calculateStatistics.CalculateAdvStatistics(statisticsMock);

        Assert.assertEquals(1000, calculateStatistics.getNumberOfPosts());
        Assert.assertEquals(1000, calculateStatistics.getNumbersOfUsers());
        Assert.assertEquals(2000, calculateStatistics.getNumberOfComments());
        Assert.assertEquals(1, calculateStatistics.getAvrPosts(), 0.01);
        Assert.assertEquals(2, calculateStatistics.getAvrComments(),0.01);
        Assert.assertEquals(2, calculateStatistics.getAvrCommToPost(), 0.01);

    }
    @Test
    public void testCalculateMorePosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfPost = 2000;
        int numberOfComments = 1000;
        List<String> myUsers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            myUsers.add("a" + i);
        }
        when(statisticsMock.postCount()).thenReturn(numberOfPost);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.usersNames()).thenReturn(myUsers);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //Then
        calculateStatistics.CalculateAdvStatistics(statisticsMock);

        Assert.assertEquals(2000, calculateStatistics.getNumberOfPosts());
        Assert.assertEquals(1000, calculateStatistics.getNumbersOfUsers());
        Assert.assertEquals(1000, calculateStatistics.getNumberOfComments());
        Assert.assertEquals(2, calculateStatistics.getAvrPosts(), 0.01);
        Assert.assertEquals(1, calculateStatistics.getAvrComments(),0.01);
        Assert.assertEquals(0.5, calculateStatistics.getAvrCommToPost(), 0.01);

    }
    @Test
    public void testCalculateZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfPost = 2000;
        int numberOfComments = 1000;
        List<String> myUsers = new ArrayList<>();

        when(statisticsMock.postCount()).thenReturn(numberOfPost);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.usersNames()).thenReturn(myUsers);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //Then
        calculateStatistics.CalculateAdvStatistics(statisticsMock);

        Assert.assertEquals(2000, calculateStatistics.getNumberOfPosts());
        Assert.assertEquals(0, calculateStatistics.getNumbersOfUsers());
        Assert.assertEquals(1000, calculateStatistics.getNumberOfComments());
        Assert.assertEquals(0, calculateStatistics.getAvrPosts(), 0.01);
        Assert.assertEquals(0, calculateStatistics.getAvrComments(),0.01);
        Assert.assertEquals(0.5, calculateStatistics.getAvrCommToPost(), 0.01);

    }
    @Test
    public void testCalculate100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfPost = 2000;
        int numberOfComments = 1000;
        List<String> myUsers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            myUsers.add("a" + i);
        }
        when(statisticsMock.postCount()).thenReturn(numberOfPost);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.usersNames()).thenReturn(myUsers);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //Then
        calculateStatistics.CalculateAdvStatistics(statisticsMock);

        Assert.assertEquals(2000, calculateStatistics.getNumberOfPosts());
        Assert.assertEquals(100, calculateStatistics.getNumbersOfUsers());
        Assert.assertEquals(1000, calculateStatistics.getNumberOfComments());
        Assert.assertEquals(20, calculateStatistics.getAvrPosts(), 0.01);
        Assert.assertEquals(10, calculateStatistics.getAvrComments(),0.01);
        Assert.assertEquals(0.5, calculateStatistics.getAvrCommToPost(), 0.01);

    }


}
