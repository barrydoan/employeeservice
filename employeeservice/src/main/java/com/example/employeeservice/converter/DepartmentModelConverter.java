package com.example.employeeservice.converter;

import com.example.employeeservice.model.Department;

public class DepartmentModelConverter extends AbstractConverter<Department, com.example.employeeservice.entity.Department> {

    @Override
    public Department toObj(com.example.employeeservice.entity.Department u) {
        Department departmentModel = null;
        if (u != null) {
            departmentModel = new Department(u.getId(), u.getName());
        }
        return departmentModel;
    }

}
