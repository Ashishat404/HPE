package com.example.restservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeControllerTest {

    @Test
    public void testGetEmployees() {
        // Setup
        EmployeeController controller = new EmployeeController();
        
        // Execute
        Employees result = controller.getEmployees();
        
        // Assert
        assertNotNull(result);
        assertEquals(3, result.getEmployeeList().size());
    }
 
    @Test
    public void testAddEmployee() {
        // Setup
        EmployeeController controller = new EmployeeController();
        Employee newEmployee = new Employee("99", "Jane", "Smith", "jane@example.com", "Cloud Engineer");
        
        // Execute
        Employee addedEmployee = controller.addEmployee(newEmployee);
        Employees result = controller.getEmployees();
        
        // Assert
        assertNotNull(addedEmployee);
        assertEquals("Jane", addedEmployee.getFirst_name());
        assertEquals(4, result.getEmployeeList().size()); // Verifies the list size increased from 3 to 4
    }
}