package main.java.sg.dlt.elevator;

import main.java.sg.dlt.elevator.components.Car;
import main.java.sg.dlt.elevator.operations.ProcessRequest;
import main.java.sg.dlt.elevator.request.ExternalRequest;
import main.java.sg.dlt.elevator.request.InternalRequest;


public class Elevator {
    enum Direction{UP, DOWN}

    public void startElevator () {
        Car car = new Car();
        ProcessRequest processRequest = new ProcessRequest();
        processRequest.processRequest();
        car.moveTo();
    }
}
