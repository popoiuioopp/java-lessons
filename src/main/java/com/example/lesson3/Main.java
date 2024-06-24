package com.example.lesson3;
// Inheritance and Polymorphism
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy", "Mammals"); // Inheritance: Dog is an Animal
        Animal myCat = new Cat("Whiskers", "Mammal", "Tuxedo"); // Inheritance: Cat is an Animal

        // Polymorphism: Animal reference, but Dog/Cat objects
        myDog.eat(); // Inherited method
        myDog.makeSound(); // Overridden method

        myCat.eat(); // Inherited method
        myCat.makeSound(); // Overridden method
    }
}