package com.example.lesson4;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return (height * width);
    }

}
