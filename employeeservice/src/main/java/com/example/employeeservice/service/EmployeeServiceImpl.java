package com.example.employeeservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeservice.converter.EmployeeEntityConverter;
import com.example.employeeservice.converter.EmployeeModelConverter;
import com.example.employeeservice.model.Employee;
import com.example.employeeservice.repository.EmployeeRepository;

import jakarta.persistence.EntityExistsException;

@Service
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
        try {
            // check employee in db
            findEmployeeById(employee.getId());
            com.example.employeeservice.entity.Employee employeeSaved = employeeRepository.save(employeeEntity);
            return new EmployeeModelConverter().toObj(employeeSaved);
        }
        catch (EntityExistsException e) {
            throw new EntityExistsException("Employee not found.");
        }
       
        
        
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

    @Override
    public Employee findEmployeeById(Long id) {
        Optional<com.example.employeeservice.entity.Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            return new EmployeeModelConverter().toObj(optionalEmployee.get());
        }
        else {
            throw new EntityExistsException("Employee not found.");
        }
    }
}
