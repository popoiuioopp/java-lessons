package com.example.lesson10;

public class Pigeon extends Bird {
    private String name;

    public Pigeon(String name) {
        this.name = name;
    }

    public void virusing() {
        System.out.println(name + " is spreading virus");
    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {
        
    }
}
