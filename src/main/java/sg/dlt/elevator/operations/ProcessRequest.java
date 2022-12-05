package main.java.sg.dlt.elevator.operations;

import main.java.sg.dlt.elevator.Elevator;
import main.java.sg.dlt.elevator.components.Car;
import main.java.sg.dlt.elevator.components.Door;
import main.java.sg.dlt.elevator.request.ExternalRequest;
import main.java.sg.dlt.elevator.request.InternalRequest;

import java.util.List;

public class ProcessRequest {
    static int CURRENT_LEVEL = 3;

    static int SOURCE_LEVEL;
    public void processRequest(){
        Car car = new Car();

        getExternalRequest();
        processExternalRequest();

        car.weightCheck();

        getInternalRequest();
        CURRENT_LEVEL = processInternalRequest();
    }
    public List<Integer> processInternalRequest(List<Integer> requests){
        //process request
        /*calculate range , assign priority
        */
        return requests;// return currentfloor
    }
    public void processExternalRequest(){

        CarOperations carOperations = new CarOperations();
        carOperations.moveTo(ProcessRequest.SOURCE_LEVEL);

    }

    public void getExternalRequest(){
        ExternalRequest externalRequest =new ExternalRequest();
        externalRequest.getExternalRequest();
    }

    public void getInternalRequest(){
        InternalRequest internalRequest = new InternalRequest();
        internalRequest.getInternalRequest();
    }
}
