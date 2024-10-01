package org.example.Creational.factory;

public class IIBDev implements Employee{
    @Override
    public int salary() {
        System.out.println("Hey! This is IIB Developer");
        return 200000;
    }
}
