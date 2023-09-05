package com.bootcoding.oops1.abstraction;

import java.io.FilterOutputStream;
import java.security.PrivilegedExceptionAction;
import java.util.concurrent.RecursiveAction;

//abstract class with an abstract method..
abstract class Shape {

        //Abstract method (no implementation)..
        public abstract double area();

        //Concrete method..
        public void printDetails(){
            System.out.println();
        }

    }

    //concrete subclass implementing the abstract method..
    class Circle extends Shape{
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        System.out.println("subclass Circle can be executed");
        return Math.PI * radius * radius;
    }
}

   //concrete subclass implementing the abstract method
  class Rectangle extends Shape{
    public  double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
}
   public double area(){
       System.out.println("subclass Rectangle can be executed ");
    return length * length;
  }
}

   class MainClass{
    public static void main(String[] args){
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
    }
  }


