package org.example.Structural.Bridge;

public class Zigbee implements CommunicationProtocol{
    @Override
    public void communicate() {
        System.out.println("Communicating via Zigbee");
    }
}
