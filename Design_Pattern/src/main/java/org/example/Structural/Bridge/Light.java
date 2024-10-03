package org.example.Structural.Bridge;

public class Light extends Device {
    public Light(CommunicationProtocol communicationProtocol){
        super(communicationProtocol);
    }
    @Override
    public void control() {
        System.out.println("Controlling Light: ");
        communicationProtocol.communicate();
    }
}
