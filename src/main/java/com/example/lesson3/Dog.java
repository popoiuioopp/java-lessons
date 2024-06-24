package com.example.lesson3;

public class Dog extends Animal {

    // NO NEED FOR 
    // private String name;
    
    public Dog(String name, String type) {
        super(name, type);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}