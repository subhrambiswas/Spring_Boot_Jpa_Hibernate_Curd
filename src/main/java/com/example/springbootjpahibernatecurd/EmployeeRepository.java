package com.example.springbootjpahibernatecurd;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

// Interface
public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {
}
