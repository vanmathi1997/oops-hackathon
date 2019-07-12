package com.stackroute.polymorphism;

public class HondaCity extends Car {
    public HondaCity(String name,int cylinders)
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
        System.out.println("Hey Honda...Accelerate!!!");

    }
    @Override
    void brake()
    {
        System.out.println("Hey HOnda...Brake!!!");
    }
    @Override
    public void display()
    {
        System.out.println(name+" car has"+wheels+" wheels "+cylinders+" cylinders and Engine Present:"+engine);
    }
}
