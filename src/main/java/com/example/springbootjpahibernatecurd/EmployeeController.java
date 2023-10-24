package com.example.springbootjpahibernatecurd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

        @Autowired
        private EmployeeService employeeService;

        // Save operation
        @PostMapping("/departments")
        public Employee saveEmployee(
                 @RequestBody Employee employee)
        {
            return employeeService.saveEmployee(employee);
        }

        // Read operation
        @GetMapping("/employees")
        public List<Employee> fetchEmployeeList()
        {
            return employeeService.fetchEmployeeList();
        }

        // Update operation
        @PutMapping("/departments/{id}")
        public Employee updateEmployee(@RequestBody Employee employee,
                         @PathVariable("id") Long employeeId)
        {
            return employeeService.updateEmployee(
                    employee, employeeId);
        }

        // Delete operation
        @DeleteMapping("/departments/{id}")
        public String deleteDepartmentById(@PathVariable("id")
                                           Long departmentId)
        {
            employeeService.deleteEmployeeById(
                    departmentId);
            return "Deleted Successfully";
        }
    }
