package org.example.Creational.AbstractFactory;

public class EmployeeFactory {

    public static Employee1 getEmployee(EmployeeAbstractFactory employeeAbstractFactory){
        return employeeAbstractFactory.createEmployee();
    }
}
