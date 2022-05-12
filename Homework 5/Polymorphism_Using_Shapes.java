package com.learning.java;

public class Polymorphism_Using_Shapes {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.make();
        System.out.println();
        circle circle = new circle();
        circle.make();
    }
}
class circle extends Polymorphism_Using_Shapes{
    public void make(){
        System.out.println("Making a circle");
    }
}

class Triangle extends Polymorphism_Using_Shapes{
    public void make(){
        System.out.println("Making a Triangle");
    }
}


