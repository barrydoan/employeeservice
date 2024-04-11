package com.example.employeeservice.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.employeeservice.entity.Department;
import com.example.employeeservice.entity.Employee;
import com.example.employeeservice.repository.DepartmentRepository;
import com.example.employeeservice.repository.EmployeeRepository;

@Configuration
public class InitConfiguration {
    @Bean
    CommandLineRunner initDataBase(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        return args -> {
            Department[] departments = new Department[] {
                new Department(Long.valueOf(1), "Research and development"),
                new Department(Long.valueOf(2), "Finance"),
                new Department(Long.valueOf(3), "It"),
                new Department(Long.valueOf(4), "Hr"),
                new Department(Long.valueOf(5), "Marketing"),
                new Department(Long.valueOf(6), "Sales")
            };
            // import deparement
            System.out.println("Reloading " + departmentRepository.save(departments[0]));
            System.out.println("Reloading " + departmentRepository.save(departments[1]));
            System.out.println("Reloading " + departmentRepository.save(departments[2]));
            System.out.println("Reloading " + departmentRepository.save(departments[3]));
            System.out.println("Reloading " + departmentRepository.save(departments[4]));
            System.out.println("Reloading " + departmentRepository.save(departments[5]));
            // import employee
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(1), "James", "Smith", "js@gmail.com", "null", departments[0])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(2), "Robert", "Johnson", "rj@gmail.com", "", departments[0])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(3), "John", "Williams", "jw@gmail.com", "null", departments[0])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(4), "Michael", "Jones", "mj@gmail.com", "", departments[1])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(5), "David", "Garcia", "dg@gmail.com", "", departments[1])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(6), "William", "Miller", "wm@gmail.com", "", departments[1])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(7), "Richard", "Davis", "rd@gmail.com", "", departments[1])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(8), "Joseph", "Rodriguez", "jr@gmail.com", "", departments[2])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(9), "Thomas", "Martinez", "tn@gmail.com", "", departments[2])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(10), "Christopher", "Hernandez", "ch@gmail.com", "", departments[2])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(11), "Charles", "Lopez", "cl@gmail.com", "", departments[2])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(12), "Daniel", "Gonzales", "dg@gmail.com", "", departments[2])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(13), "Matthew", "Wilson", "mw@gmail.com", "", departments[2])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(14), "Anthony", "Anderson", "aa@gmail.com", "", departments[2])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(15), "Mark", "Thomas", "mt@gmail.com", "", departments[3])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(16), "Donald", "Taylor", "dt@gmail.com", "", departments[3])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(17), "Steven", "Moore", "sm@gmail.com", "", departments[3])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(18), "Andrew", "Jackson", "aj@gmail.com", "", departments[3])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(19), "Paul", "Lee", "pl@gmail.com", "", departments[3])));
            System.out.println("Reloading " + employeeRepository.save(new Employee(Long.valueOf(20), "Joshua", "Perez", "jp@gmail.com", "", departments[3])));

        };
    }
    

}
