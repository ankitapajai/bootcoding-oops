package com.bootcoding.oops1.abstraction;

abstract class Employee {
    private final String name;

    public Employee(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class SystemEngineer extends Employee{
    public SystemEngineer(String name){
        super(name);
    }
}

class Tester{
    public static void main(String[] args) {
        Employee se = new SystemEngineer("Maria");
        System.out.println(se.getName());
    }
}
