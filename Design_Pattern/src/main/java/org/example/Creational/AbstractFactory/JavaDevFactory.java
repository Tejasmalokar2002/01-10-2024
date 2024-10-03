package org.example.Creational.AbstractFactory;

public class JavaDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee1 createEmployee() {
        return new JavaDev();
    }
}
