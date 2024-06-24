package com.example.lesson3;

class Cat extends Animal {
    private String color;

    public Cat(String name, String type, String color) {
        super(name, type);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}