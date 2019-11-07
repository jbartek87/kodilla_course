package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
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
        OddNumbersExterminator emptyList = new OddNumbersExterminator();
        ArrayList<Integer> testingNumb = new ArrayList<>();
        emptyList.exterminate(testingNumb);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
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
        for(Integer lotOf : lotOfnumbers){
            System.out.println(lotOf);
        }
        System.out.println("************");
        fullList.exterminate(lotOfnumbers);
        for(Integer lotOf : lotOfnumbers){
            System.out.println(lotOf);
        }
    }


}
