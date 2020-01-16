package com.kodilla.patterns.factory.tasks;

public class PaintingTask {
    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(final String taskName ,final String color ,final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }
}
