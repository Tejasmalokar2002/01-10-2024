package org.example.Structural.Adapter2;

public class Iphone13 {
    public Iphone13(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    private AppleCharger appleCharger;
    public void chargeIphone(){
        appleCharger.chargePhone();
    }
}
