package org.example.Structural.Bridge;

public class Fan extends Device{
    public Fan(CommunicationProtocol communicationProtocol){
        super(communicationProtocol);
    }
    @Override
    public void control() {
        System.out.println("Controlling Fan ");
        communicationProtocol.communicate();
    }
}
