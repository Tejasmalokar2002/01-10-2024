package org.example.Creational.AbstractFactory;

public class WebDevFactory extends EmployeeAbstractFactory{

    @Override
    public Employee1 createEmployee() {
        return new WebDev();
    }
}
