package org.example.Structural.Bridge;

public class Bluetooth implements CommunicationProtocol{
    @Override
    public void communicate() {
        System.out.println("Communicating via Bluetooth");
    }
}
