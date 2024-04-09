package com.example.employeeservice.model;

public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Department department;
    
    public Employee() {
    }
    public Employee(Integer id, String firstName, String lastName, String email, String phone, Department department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.department = department;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public Integer getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public Department getDepartment() {
        return department;
    }
    
}
