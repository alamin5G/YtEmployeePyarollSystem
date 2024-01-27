package com.goonok;

import com.goonok.abstracttion.Employee;

import java.util.ArrayList;
import java.util.List;

public class PyarollSystem {
    private List<Employee> employeeList;

    public PyarollSystem() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employee = null;
        for (Employee employee1 : employeeList){
            if (employee1.getId() == id){
                employee = employee1;
                break;
            }
        }

        if (employee!= null){
            employeeList.remove(employee);
        }
    }

    public void displayEmployees(){
        for (Employee employee: employeeList){
            System.out.println(employee.toString());
        }
    }
}
