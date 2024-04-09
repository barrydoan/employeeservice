package com.example.employeeservice.converter;

import com.example.employeeservice.entity.Department;

public class DepartmentEntityConverter extends AbstractConverter<Department, com.example.employeeservice.model.Department> {

    @Override
    public Department toObj(com.example.employeeservice.model.Department u) {
        Department departmentEntity = null;
        if (u != null) {
            departmentEntity = new Department();
            departmentEntity.setId(u.getId());
            departmentEntity.setName(u.getName());
        }
        return departmentEntity;
    }

}
