package main.java.sg.dlt.elevator.request;

import main.java.sg.dlt.elevator.operations.ProcessRequest;

import java.util.ArrayList;
import java.util.List;

public class InternalRequest {
    int destinationLevel;
    int sourceLevel;
    public void getInternalRequest(){
        List<Integer> internalRequest = new ArrayList<>();
    }
    public void processInternalRequest(List<Integer> request){
        ProcessRequest processRequest = new ProcessRequest();
        processRequest.processInternalRequest(request);

    }
}
