package org.example.Creational.AbstractFactory;


public class JavaDev implements Employee1 {
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name(){
        System.out.println("Hey! This is Java Developer by Abstract Factory Method");
        return "Java Developer";
    }
}
