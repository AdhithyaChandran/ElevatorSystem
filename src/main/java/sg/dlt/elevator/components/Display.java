package main.java.sg.dlt.elevator.components;

import main.java.sg.dlt.elevator.operations.DisplayOperations;

public class Display {
    private int floorNumber;
    private int direction;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void displayLevel(){
        DisplayOperations displayOperations = new DisplayOperations();
        displayOperations.displayLevel();
    }
}
