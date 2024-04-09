package com.example.employeeservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeservice.converter.DepartmentModelConverter;
import com.example.employeeservice.model.Department;
import com.example.employeeservice.repository.DepartmentRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> listDepartments() {
        List<com.example.employeeservice.entity.Department> departmentEntityList = (List<com.example.employeeservice.entity.Department>)departmentRepository.findAll();
        List<Department> departmentList = new DepartmentModelConverter().toListObj(departmentEntityList);
        return departmentList;
    }

    @Override
    public Department findDepartment(long id) {
        Optional<com.example.employeeservice.entity.Department> departmentOptional = departmentRepository.findById(id);
        if (departmentOptional.isPresent()) {
            return new DepartmentModelConverter().toObj(departmentOptional.get());
        }
        else {
            throw new EntityNotFoundException("Department Not Found");
        }
    }

}
