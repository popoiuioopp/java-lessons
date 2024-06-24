package com.example.lesson1;

// Basic Classes and Methods
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bos", 24);
        Person person2 = new Person("Arm", 19);

        // Order person to say hello!
        person.sayHello();
        person2.sayHello();
    }
}
