package org.example.Creational.factory;

public class JavaDev implements Employee{
    @Override
    public int salary() {
        System.out.println("Hey! This is Java Developer");
        return 100000;
    }
}
