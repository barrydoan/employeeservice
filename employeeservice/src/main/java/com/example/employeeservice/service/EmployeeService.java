package com.example.employeeservice.service;

import java.util.List;

import com.example.employeeservice.model.Employee;

public interface EmployeeService {
    List<Employee> listEmployees();
    Employee createeEmployee(Employee employee);
    Employee editEmployee(Employee employee);
    Boolean deleteEmployee(Long id);

}
