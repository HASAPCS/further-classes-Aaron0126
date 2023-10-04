package com.example;

import java.util.List;
import java.util.ArrayList;


public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name=name;
        this.employees = new ArrayList<Employee>();
        // TODO: Initialize the attributes
    }
    public String getName(){
        return name;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
    public List<Employee> getEmployees(){
        return this.employees;
    }
    // TODO: Implement methods to add an employee, remove an employee, and calculate the average salary for the department
}