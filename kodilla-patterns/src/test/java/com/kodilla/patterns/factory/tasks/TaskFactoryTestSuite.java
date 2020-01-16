package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testCreatingTasks() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.createTask( TaskFactory.DRIVING );
        Task painting = factory.createTask( TaskFactory.PAINTING );
        Task shopping = factory.createTask( TaskFactory.SHOPING );
        //Then
        Assert.assertEquals( "Taxi" , driving.getTaskName() );
        Assert.assertEquals( "Tim's House" , painting.getTaskName() );
        Assert.assertEquals( "Tesco" , shopping.getTaskName() );
    }

    @Test
    public void testExecuteTasks() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.createTask( TaskFactory.DRIVING );
        System.out.println( "Driving task status: " + driving.isTaskExecuted() );
        Task shopping = factory.createTask( TaskFactory.SHOPING );
        System.out.println( "Shopping task status: " + shopping.isTaskExecuted() );
        Task painting = factory.createTask( TaskFactory.PAINTING );
        System.out.println( "Painting task status: " + painting.isTaskExecuted() );
        boolean doDriving = driving.executeTask();
        boolean doShopping = shopping.executeTask();
        boolean doPainting = painting.executeTask();
        //Then
        System.out.println( "Driving task status: " + driving.isTaskExecuted() );
        System.out.println( "Shopping task status: " + shopping.isTaskExecuted() );
        System.out.println( "Painting task status: " + painting.isTaskExecuted() );
        Assert.assertTrue( doDriving );
        Assert.assertTrue( doShopping );
        Assert.assertTrue( doPainting );


    }
}
