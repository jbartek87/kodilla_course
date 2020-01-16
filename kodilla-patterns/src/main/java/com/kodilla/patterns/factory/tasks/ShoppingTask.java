package com.kodilla.patterns.factory.tasks;

public class ShoppingTask {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    public ShoppingTask(final String taskName ,final String whatToBuy ,final     double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }
}
