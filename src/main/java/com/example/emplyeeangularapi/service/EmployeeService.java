package com.example.emplyeeangularapi.service;

import com.example.emplyeeangularapi.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> findAllEmployee();

    Employee updateEmployee(Employee employee);

    Employee findEmployeeById(Long id);

    void deleteEmployee(Long id);
}
