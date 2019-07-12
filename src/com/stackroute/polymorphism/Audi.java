package com.stackroute.polymorphism;

public class Audi extends Car {
    public Audi(String name,int cylinders)
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
        System.out.println("Hey Audi...Accelerate!!!");

    }
    @Override
    void brake()
    {
        System.out.println("Hey Audi...Brake!!!");
    }
    @Override
    public void display()
    {
        System.out.println(name+" car has"+wheels+" wheels "+cylinders+" cylinders and Engine Present:"+engine);
    }
}
