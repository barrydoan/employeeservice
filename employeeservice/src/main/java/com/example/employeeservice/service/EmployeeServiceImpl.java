package com.example.employeeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.employeeservice.converter.EmployeeEntityConverter;
import com.example.employeeservice.converter.EmployeeModelConverter;
import com.example.employeeservice.model.Employee;
import com.example.employeeservice.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> listEmployees() {
        List<com.example.employeeservice.entity.Employee> employeeEntityList = (List<com.example.employeeservice.entity.Employee>) employeeRepository.findAll();
        return new EmployeeModelConverter().toListObj(employeeEntityList);
    }

    @Override
    public Employee createeEmployee(Employee employee) {
        com.example.employeeservice.entity.Employee employeeEntity = new EmployeeEntityConverter().toObj(employee);
        com.example.employeeservice.entity.Employee employeeSaved = employeeRepository.save(employeeEntity);
        return new EmployeeModelConverter().toObj(employeeSaved);
    }

    @Override
    public Employee editEmployee(Employee employee) {
        com.example.employeeservice.entity.Employee employeeEntity = new EmployeeEntityConverter().toObj(employee);
        com.example.employeeservice.entity.Employee employeeSaved = employeeRepository.save(employeeEntity);
        return new EmployeeModelConverter().toObj(employeeSaved);
    }

    @Override
    public Boolean deleteEmployee(Long id) {
        try {
            employeeRepository.deleteById(id);
            return true;
        }
        catch (Exception e) {
            return false;
        }   
    }
}
