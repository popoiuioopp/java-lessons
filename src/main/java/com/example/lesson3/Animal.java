package com.example.lesson3;

public class Animal {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void makeSound() {
        System.out.println("<Some generic animal sound>");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}