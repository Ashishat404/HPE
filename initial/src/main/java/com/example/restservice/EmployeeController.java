package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private EmployeeManager manager = new EmployeeManager();

    // Handles GET requests
    @GetMapping("/employees")
    public Employees getEmployees() {
        return manager.getEmployees();
    }

    // Handles POST requests
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        manager.addEmployee(employee);
        return employee; // Returns the newly added employee as a response
    }
}