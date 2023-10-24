package com.example.springbootjpahibernatecurd;

import java.util.List;

public interface EmployeeService {


    Employee saveEmployee(Employee employee);

    // Read operation
    List<Employee> fetchEmployeeList();

    // Update operation
    Employee updateEmployee(Employee employee,
                                Long employeeId);

    // Delete operation
    void deleteEmployeeById(Long employeeId);
}
