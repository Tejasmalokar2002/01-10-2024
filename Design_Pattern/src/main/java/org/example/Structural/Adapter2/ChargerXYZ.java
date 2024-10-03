package org.example.Structural.Adapter2;

public class ChargerXYZ implements AppleCharger{
    @Override
    public void chargePhone() {
        System.out.println("Your iPhone is charging");
    }
}
