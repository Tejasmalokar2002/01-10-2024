package org.example.Structural.Bridge;

public class Heater extends Device{
    public Heater(CommunicationProtocol communicationProtocol){
        super(communicationProtocol);
    }
    @Override
    public void control() {
        System.out.println("Controlling Heater: ");
        communicationProtocol.communicate();
    }
}
