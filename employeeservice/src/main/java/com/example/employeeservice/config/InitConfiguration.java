package com.example.employeeservice.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.employeeservice.entity.Department;
import com.example.employeeservice.repository.DepartmentRepository;

@Configuration
public class InitConfiguration {
    @Bean
    CommandLineRunner initDataBase(DepartmentRepository departmentRepository) {
        return args -> {
            System.out.println("Reloading " + departmentRepository.save(new Department(1, "Research and development")));
            System.out.println("Reloading " + departmentRepository.save(new Department(2, "Finance")));
            System.out.println("Reloading " + departmentRepository.save(new Department(3, "It")));
            System.out.println("Reloading " + departmentRepository.save(new Department(4, "Hr")));
            System.out.println("Reloading " + departmentRepository.save(new Department(5, "Marketing")));
            System.out.println("Reloading " + departmentRepository.save(new Department(6, "Sales")));
        };
    }
    

}
