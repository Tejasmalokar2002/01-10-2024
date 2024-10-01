package org.example.Creational.AbstractFactory;



public class WebDev implements Employee1 {
    @Override
    public int salary() {
        return 40000;
    }

    @Override
    public String name(){
        System.out.println("Hey! This is Web Developer by Abstract Factory Method");
        return "Web Developer";
    }
}
