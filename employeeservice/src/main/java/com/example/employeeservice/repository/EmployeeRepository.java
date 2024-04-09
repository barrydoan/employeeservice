package com.example.employeeservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.employeeservice.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
