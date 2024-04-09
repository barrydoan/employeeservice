package com.example.employeeservice.converter;

import com.example.employeeservice.entity.Employee;

public class EmployeeEntityConverter extends AbstractConverter<Employee, com.example.employeeservice.model.Employee> {

    @Override
    public Employee toObj(com.example.employeeservice.model.Employee u) {
        Employee employee = null;
        if (u != null) {
            employee = new Employee();
            employee.setId(u.getId());
            employee.setFirstName(u.getFirstName());
            employee.setLastName(u.getLastName());
            employee.setEmail(u.getEmail());
            employee.setPhone(u.getPhone());
            DepartmentEntityConverter dec = new DepartmentEntityConverter();
            employee.setDepartment(dec.toObj(u.getDepartment()));
        }
        return employee;
    }

}
