package com.example.lesson5;

// Inheritance + Polymorphism + Abstraction
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

        myCar.ride();
        myCar.startEngine(); // Car engine started.

        myMotorcycle.ride();
        myMotorcycle.startEngine(); // Motorcycle engine started.
    }
}
