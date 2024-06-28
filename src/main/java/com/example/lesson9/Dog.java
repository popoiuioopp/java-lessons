package com.example.lesson9;

public class Dog implements Animal, Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
    
    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}
