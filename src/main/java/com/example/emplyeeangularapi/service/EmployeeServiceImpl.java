package com.example.emplyeeangularapi.service;

import com.example.emplyeeangularapi.exception.UserNotFoundException;
import com.example.emplyeeangularapi.model.Employee;
import com.example.emplyeeangularapi.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
@Slf4j
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode("emp-" + UUID.randomUUID().toString().substring(0, 7).toLowerCase());
        log.info("Adding Employee: {}", employee.getName());
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAllEmployee() {
        log.info("Fetching All Employees");
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee){
        log.info("Updating Employee: {}", employee.getName());
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(Long id){
        log.info("Finding Employee by ID: {}", id);
        return employeeRepository.findById(id)
                .orElseThrow(()-> new UserNotFoundException("Employee by id " + id + " not found"));
    }

    public void deleteEmployee(Long id){
        employeeRepository.findById(id)
                .orElseThrow(()-> new UserNotFoundException("Employee by id " + id + " not found"));
        employeeRepository.deleteById(id);
    }

}
