package com.example.employeeservice.converter;

import com.example.employeeservice.model.Employee;

public class EmployeeModelConverter extends AbstractConverter<Employee, com.example.employeeservice.entity.Employee> {

    @Override
    public Employee toObj(com.example.employeeservice.entity.Employee u) {
        Employee employee = null;
        if (u != null) {
            employee = new Employee();
            employee.setId(u.getId());
            employee.setFirstName(u.getFirstName());
            employee.setLastName(u.getLastName());
            employee.setEmail(u.getEmail());
            employee.setPhone(u.getPhone());
            DepartmentModelConverter dmc = new DepartmentModelConverter();

            employee.setDepartment(dmc.toObj(u.getDepartment()));
        }
        return employee;
    }

}
