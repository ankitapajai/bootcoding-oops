package com.bootcoding.oops1.polymorphism;

public class Animal {
    //overriding
    public void eat(){
        System.out.println("i am eating");
    }

}
class Dog extends Animal{
    public void eat() {
        System.out.println("i am running");
    }
}
class Main1{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}

