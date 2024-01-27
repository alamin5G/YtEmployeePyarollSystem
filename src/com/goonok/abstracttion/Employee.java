package com.goonok.abstracttion;

public abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + calculateSalary() +
                '}';
    }

    ///TODO - 13:40 MINUTES https://www.youtube.com/watch?v=o-JnANhtMVM

}
