package com.sathya.service;

import java.util.List;

import com.sathya.entity.Employee;

public interface EmployeeService {
    public long createEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(long id);
    public List<Employee> getAllEmployees();
    public Employee getEmployee(long id);   
    public List<Employee> getAllEmployees(String employeeName);
}