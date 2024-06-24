package com.example.lesson1;

public class Person {
    // These are attributes
    private String attributeName;
    private int attributeAge;

    public Person(String inputName, int inputAge) {
        System.out.println("I am constructing Person object");
        
        this.attributeName = inputName;
        this.attributeAge = inputAge;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + attributeName + " and I am " + attributeAge + " years old.");
    }
  
    public void changeInfo(String changeName, int changeAge) {
        this.attributeName = changeName;
        this.attributeAge = changeAge;
    }
}
