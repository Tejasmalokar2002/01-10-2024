package org.example.Behavioral;

public class Subscriber implements Observer{

    String name;
    public Subscriber(String name){
        this.name=name;
    }
    @Override
    public void notified(String title) {
        System.out.println("Hello " + name + " New video uploaded : notification " + title);
    }
}
