package com.kodilla.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPINGTASK -> new ShoppingTask("Grocery", "Onion", 2);
            case PAINTINGTASK -> new PaintingTask("Flat Wall", "Red", "Wall");
            case DRIVINGTASK -> new DrivingTask("Road to Warsaw", "Warsaw", "Train");
            default -> null;
        };
    }
}
