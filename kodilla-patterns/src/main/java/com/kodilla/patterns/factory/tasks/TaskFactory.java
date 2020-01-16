package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPING:
                return new ShoppingTask( "Tesco" , "milk" , 2 );
            case DRIVING:
                return new DrivingTask( "Taxi", "Chicago", "car" );
            case PAINTING:
                return new PaintingTask( "Tim's House", "yellow", "wall" );
            default:
                return null;
        }
    }
}
