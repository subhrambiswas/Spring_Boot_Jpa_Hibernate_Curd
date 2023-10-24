package com.example.springbootjpahibernatecurd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> fetchEmployeeList() {
        return (List<Employee>)
                employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee, Long employeeId) {
//        Employee depDB
//                = employeeRepository.findById(departmentId)
//                .get();
//
//        if (Objects.nonNull(employee.get())
//                && !"".equalsIgnoreCase(
//                department.getDepartmentName())) {
//            depDB.setDepartmentName(
//                    department.getDepartmentName());
//        }
//
//        if (Objects.nonNull(
//                department.getDepartmentAddress())
//                && !"".equalsIgnoreCase(
//                department.getDepartmentAddress())) {
//            depDB.setDepartmentAddress(
//                    department.getDepartmentAddress());
//        }
//
//        if (Objects.nonNull(department.getDepartmentCode())
//                && !"".equalsIgnoreCase(
//                department.getDepartmentCode())) {
//            depDB.setDepartmentCode(
//                    department.getDepartmentCode());
//        }
//
//        return departmentRepository.save(depDB);
        return null;
    }

    @Override
    public void deleteEmployeeById(Long employeeId) {

        employeeRepository.deleteById(employeeId);
    }
}
