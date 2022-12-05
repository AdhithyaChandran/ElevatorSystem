package main.java.sg.dlt.elevator.components;

import main.java.sg.dlt.elevator.operations.DoorOperations;

public class Door {

    public void open(){
        DoorOperations doorOperations = new DoorOperations();
        doorOperations.open();
    }
    public void close(){
        DoorOperations doorOperations = new DoorOperations();
        doorOperations.close();
    }
}
