package org.example.Structural.Bridge;

public abstract class Device {

    protected CommunicationProtocol communicationProtocol;

    public  Device(CommunicationProtocol communicationProtocol){
        this.communicationProtocol=communicationProtocol;
    }

    public abstract void control();
}
