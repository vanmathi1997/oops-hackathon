package com.stackroute.polymorphism;

public class Car {
     String name;
     Boolean engine;
     int wheels;
     int cylinders;

    public  Car(String carName,int noOfCylinders)
     {  this.name=carName;
         this.wheels=4;
         this.engine=true;
         this.cylinders=noOfCylinders;
     }
     public void display()
     {
         System.out.println(name+" car has  "+wheels+" wheels "+cylinders+" cylinders and Engine Present: "+ engine);
     }
    void startEngine()
    {
        System.out.println(name+"'s Engine started!!!");
    }
    void accelerate()
    {
        System.out.println("Accelerate!!!");

    }
    void brake()
    {
        System.out.println("Brake!!!");
    }
}
