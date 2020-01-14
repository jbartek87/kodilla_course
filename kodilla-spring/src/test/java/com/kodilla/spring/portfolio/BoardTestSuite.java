package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext (BoardConfig.class);
        Board board = context.getBean( Board.class );
        //When
        board.getToDoList().tasks.add( 0,"Do check list" );
        board.getInProgressList().tasks.add( 0, "Loading element" );
        board.getDoneList().tasks.add(0, "Saving screen");
        //Then
        Assert.assertEquals("Do check list", board.getToDoList().getTasks().get( 0 ) );
        Assert.assertEquals("Loading element", board.getInProgressList().getTasks().get( 0 ));
        Assert.assertEquals("Saving screen", board.getDoneList().getTasks().get( 0 ));
    }
}
