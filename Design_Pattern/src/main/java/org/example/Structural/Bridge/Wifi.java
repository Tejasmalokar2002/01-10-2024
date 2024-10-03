package org.example.Structural.Bridge;

public class Wifi implements CommunicationProtocol{
    @Override
    public void communicate() {
        System.out.println("Communicating via Wifi");
    }
}
