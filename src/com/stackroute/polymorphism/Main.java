package com.stackroute.polymorphism;

public class Main {
    public static void main(String[] args)
    {   //BMW
        Car bmw=new BMW("BMW",4);
        bmw.display();
        bmw.startEngine();
        bmw.accelerate();
        bmw.brake();
        //Audi
        Car audi=new Audi("Audi",3);
        audi.display();
        audi.startEngine();
        audi.accelerate();
        audi.brake();
        //HondaCity
        Car hondacity=new HondaCity("HondaCity",4);
        hondacity.display();
        hondacity.startEngine();
        hondacity.accelerate();
        hondacity.brake();

    }
}
