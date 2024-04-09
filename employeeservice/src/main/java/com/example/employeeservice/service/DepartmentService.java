package com.example.employeeservice.service;

import java.util.List;

import com.example.employeeservice.model.Department;

public interface DepartmentService {
    List<Department> listDepartments();
    Department findDepartment(long id);
}
