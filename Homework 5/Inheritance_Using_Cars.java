package com.learning.java;

class Vehicle{
    String type;
    String model;
    String color;

    Vehicle (String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    void output(){
        System.out.println("The type of this car is: "+type);
        System.out.println("The model of this car is: "+model);
        System.out.println("The color of this car is: "+color);
    }

}
public class Inheritance_Using_Cars extends  Vehicle{
    Inheritance_Using_Cars(String type, String model, String color) {
        super(type, model, color);
    }

    public static void main(String[] args) {
        System.out.println("First we will make Ford");
        Vehicle ford = new Vehicle("Ford", "Focus", "red");
        ford.output();
        System.out.println();
        System.out.println("Next we will make Toyota");
        Vehicle auris = new Vehicle("Toyota", "Prius", "Silver");
        auris.output();
    }

}
