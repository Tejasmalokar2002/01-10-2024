package org.example.Creational.factory;

public class EmployeeFactory {

    public static Employee getEmployee(String emptype){
            if(emptype.trim().equalsIgnoreCase("Java Developer")){
                return new JavaDev();
            } else if (emptype.trim().equalsIgnoreCase("IIB Developer")) {
                return new IIBDev();
            }else{
                return null;
            }
    }
}
