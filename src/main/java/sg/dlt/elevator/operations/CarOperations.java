package main.java.sg.dlt.elevator.operations;

import main.java.sg.dlt.elevator.components.Display;

public class CarOperations {
    public void weightCheck(){
        //if weight exceeds a limit then open
    }
    public void moveTo(int destinationLevel){
        // move according to internal and external request

        if (ProcessRequest.CURRENT_LEVEL < destinationLevel) {
            while (ProcessRequest.CURRENT_LEVEL != destinationLevel) {
                ProcessRequest.CURRENT_LEVEL += 1;

            }
        } else {
            while (ProcessRequest.CURRENT_LEVEL != ProcessRequest.CURRENT_LEVEL) {
                ProcessRequest.CURRENT_LEVEL -= 1;
            }
        }


        //display while each floor
        Display display = new Display();
        display.displayLevel();
    }
}
