package org.example;

import org.example.Behavioral.Subscriber;
import org.example.Behavioral.YoutubeChannel;
import org.example.Creational.AbstractFactory.Employee1;
import org.example.Creational.AbstractFactory.JavaDevFactory;
import org.example.Creational.AbstractFactory.WebDevFactory;
import org.example.Creational.Prototype.NetworkConnection;
import org.example.Creational.Singleton.Singleton;
import org.example.Creational.factory.Employee;
import org.example.Creational.factory.EmployeeFactory;
import org.example.Structural.Adapter2.*;
import org.example.Structural.Adapter1.BankCustomer;
import org.example.Structural.Adapter1.CreditCard;
import org.example.Structural.Bridge.*;
import org.example.Structural.Composite.Directory;
import org.example.Structural.Composite.File;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException {
        //Start of Creational
        //Singleton
        System.out.println( "Hello World!" );
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        //Singleton

        //Factory
        Employee emp = EmployeeFactory.getEmployee("Java Developer");
        System.out.println(emp);
        System.out.println(emp.salary());
        Employee emp1 = EmployeeFactory.getEmployee("IIB Developer");
        System.out.println(emp1);
        System.out.println(emp1.salary());
        //Factory

        //Abstract Factory
        Employee1 employee1 = org.example.Creational.AbstractFactory.EmployeeFactory.getEmployee(new JavaDevFactory());
        employee1.name();
        employee1.salary();
        Employee1 employee2 = org.example.Creational.AbstractFactory.EmployeeFactory.getEmployee(new WebDevFactory());
        employee2.name();
        employee2.salary();

        //Prototype
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.122.1");
        try {
            networkConnection.loadVeryImportantData();
            System.out.println(networkConnection);

            NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection1);
        } catch (InterruptedException | CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        //End of Creational//




        System.out.println();




        //Start of Structural
        //Adapter Example 1
        CreditCard targetInterface=new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());

        //Adapter Example 2
        AppleCharger appleCharger = new AdapterCharger(new DKCharger());
        Iphone13 iphone13 = new Iphone13(appleCharger);
        iphone13.chargeIphone();

        //Composite
        //(Creating Leaf Object)
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        //(Creating Composite Object [Directories])
        Directory directory1 = new Directory("Directory 1");
        Directory directory2 = new Directory("Directory 2");

        //(Adding Files to Directories)
        directory1.addComponent(file1);
        directory1.addComponent(file2);
        directory2.addComponent(file3);

        //(Creating root Directory)
        Directory rootDirectory = new Directory("Root Directory");
        rootDirectory.addComponent(file1);
        rootDirectory.addComponent(file2);
        rootDirectory.addComponent(file3);

        //Displaying the entire file system of hierarchy
        rootDirectory.showDetails();




        //Bridge
        CommunicationProtocol wifi = new Wifi();
        CommunicationProtocol bluetooth = new Bluetooth();
        CommunicationProtocol zigbee = new Zigbee();

        Device fan = new Fan(wifi);
        Device light = new Light(bluetooth);
        Device heater = new Heater(zigbee);

        fan.control();
        light.control();
        heater.control();

        //End of Structural
        System.out.println();





        //Start of Behavioral
        //Observer
//        YoutubeChannel channel = new YoutubeChannel();
//        Subscriber tejas = new Subscriber("Tejas");
//        channel.subscribe(tejas);
//        channel.newVideoUploaded("Learn Design Pattern");
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        while (true){
//            System.out.println("Press 1 to upload video");
//            System.out.println("Press 2 to create new subscriber");
//            System.out.println("Press 3 to exit");
//
//            int c = Integer.parseInt(br.readLine());
//            switch (c) {
//                case 1:
//                    // Upload a new video
//                    System.out.println("Enter video title:");
//                    String videoTitle = br.readLine();
//                    channel.newVideoUploaded(videoTitle);
//                    break;
//
//                case 2:
//                    // Create a new subscriber
//                    System.out.println("Enter name of subscriber:");
//                    String subsName = br.readLine();
//                    Subscriber newSubscriber = new Subscriber(subsName);
//                    channel.subscribe(newSubscriber);
//                    break;
//
//                case 3:
//                    System.out.println("Thank You For Using App!");
//                    return;
//
//                default:
//                    System.out.println("Wrong input! Please try again.");
//                    break;
//            }
//        }
    }

}



