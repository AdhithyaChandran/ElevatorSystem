package main.java.sg.dlt.elevator.components;

import main.java.sg.dlt.elevator.operations.CarOperations;
import main.java.sg.dlt.elevator.request.ExternalRequest;

public class Car {
    public void weightCheck(){
        CarOperations carOperations = new CarOperations();
        carOperations.weightCheck();
    }
    public void moveTo(){
        CarOperations carOperations = new CarOperations();
        carOperations.moveTo();
    }

}
