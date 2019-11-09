package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class OddNumbersExterminatorTest {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator emptyList = new OddNumbersExterminator();
        ArrayList<Integer> testingNumb = new ArrayList<>();
        //When
        ArrayList<Integer> result = emptyList.exterminate(testingNumb);
        //Then
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator fullList = new OddNumbersExterminator();
        ArrayList<Integer> lotOfnumbers = new ArrayList<>();
        lotOfnumbers.add(1);
        lotOfnumbers.add(2);
        lotOfnumbers.add(3);
        lotOfnumbers.add(4);
        lotOfnumbers.add(5);
        lotOfnumbers.add(6);
        lotOfnumbers.add(7);
        lotOfnumbers.add(8);
        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);
        expectedList.add(8);
        //When
        ArrayList<Integer> result = fullList.exterminate(lotOfnumbers);
        //Then
        Assert.assertEquals(expectedList, result);
    }
}