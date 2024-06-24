package com.example.basic101;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        speakName();
      	eating();
    }

    public static String getName() {
        return "My object name is Main!";
    }

    public static void speakName() {
        System.out.println(getName());
    }

    public static void sit() {
        System.out.println("I am sitting");
    }
  
    public static void eating() {
        System.out.println("i am eating");
    }
  
}
