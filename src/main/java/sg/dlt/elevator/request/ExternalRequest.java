package main.java.sg.dlt.elevator.request;

import main.java.sg.dlt.elevator.operations.ProcessRequest;

public class ExternalRequest {
    enum direction{UP ,DOWN};


    public void processExternalRequest(){
        ProcessRequest processRequest = new ProcessRequest();
        processRequest.processExternalRequest();
    }

    public void getExternalRequest(){
        // get sourcefloor
    }
}
