package com.example.employeeservice.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeservice.model.Department;
import com.example.employeeservice.service.DepartmentService;

@RestController
@RequestMapping("/employeemanagement")
public class EmployeeController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public ResponseEntity<List<Department>> getAllDepartments() {
        List<Department> departmentList = departmentService.listDepartments();
        return new ResponseEntity<List<Department>>(departmentList, HttpStatus.OK);
    }

}
