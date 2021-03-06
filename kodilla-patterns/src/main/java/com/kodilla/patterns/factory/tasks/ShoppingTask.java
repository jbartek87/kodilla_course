package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean taskStatus = false;

    public ShoppingTask(final String taskName ,final String whatToBuy ,final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public boolean executeTask() {
        taskStatus = true;
        return true;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskStatus;
    }

    public String getTaskName() {
        return taskName;
    }
}
