package com.kodilla.stream;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] myIntArray = new int[]{1, 2, 3, 4,};

        //When
       OptionalDouble mySolution =  ArrayOperations.getAverage(myIntArray);

        //Then
        Assert.assertEquals(2.5, mySolution.getAsDouble(), 0.01);
    }
}
