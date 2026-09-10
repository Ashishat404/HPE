package com.example.restservice;

public class EmployeeManager {
    private Employees employees = new Employees();

    public EmployeeManager() {
        employees.getEmployeeList().add(new Employee("1", "Ashish", "Bhatt", "ashish@example.com", "Software Engineer"));
        employees.getEmployeeList().add(new Employee("2", "Stella", "Yun", "stella@example.com", "Director"));
        employees.getEmployeeList().add(new Employee("3", "John", "Doe", "john@example.com", "Analyst"));
    }

    public Employees getEmployees() {
        return employees;
    }

    // NEW METHOD: Adds a new employee to the list
    public void addEmployee(Employee employee) {
        employees.getEmployeeList().add(employee);
    }
}