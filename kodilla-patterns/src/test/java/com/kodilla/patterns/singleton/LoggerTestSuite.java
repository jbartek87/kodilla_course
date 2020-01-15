package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void openLogFile(){
        Logger.getInstance().log( "This is first log" );
    }

    @Test
    public void testGetLadLog() {
        //Given
        //When
        Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals( "This is first log" , Logger.getInstance().getLastLog());

    }

}
