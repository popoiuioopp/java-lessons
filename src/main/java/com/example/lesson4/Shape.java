package com.example.lesson4;

abstract class Shape {
    // Abstract method (no implementation)
    public abstract double calculateArea();

    // Concrete method (with implementation)
    public void display() {
        System.out.println("This is a shape.");
    }
}