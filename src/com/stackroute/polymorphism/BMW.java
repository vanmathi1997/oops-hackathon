package com.stackroute.polymorphism;

public class BMW extends Car{
    public BMW(String name,int cylinders)
    {
        super(name,cylinders);
    }
    @Override
    public void startEngine()
    {
        System.out.println(name+" Engine started");
    }
    @Override
    void accelerate()
    {
        System.out.println("Hey BMW Please Accelerate!!!");

    }
    @Override
    void brake()
    {
        System.out.println("Hey BMW...Brake!!!");
    }
    @Override
    public void display()
    {
        System.out.println(name+" car has"+wheels+" wheels "+cylinders+" cylinders and Engine Present:"+engine);
    }


}
