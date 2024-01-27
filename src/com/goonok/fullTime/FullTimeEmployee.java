package com.goonok.fullTime;

import com.goonok.abstracttion.Employee;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    public double calculateSalary() {
        return 0;
    }
}
