package com.example.employeeservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.employeeservice.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
