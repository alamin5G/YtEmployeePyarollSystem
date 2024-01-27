package com.goonok;

import com.goonok.EmployeesType.FullTimeEmployee;
import com.goonok.EmployeesType.PartTimeEmployee;

public class Main {
    public static void main(String[] args) {

        PyarollSystem pyarollSystem = new PyarollSystem();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alamin", 1, 15000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Rakib", 2, 70, 15);

        pyarollSystem.addEmployee(fullTimeEmployee);
        pyarollSystem.addEmployee(partTimeEmployee);
        System.out.println("Initial Employee Details: ");
        pyarollSystem.displayEmployees();
        System.out.println("Employee Removing");
        pyarollSystem.removeEmployee(2);
        System.out.println("Employee Details");
        pyarollSystem.displayEmployees();

    }
}