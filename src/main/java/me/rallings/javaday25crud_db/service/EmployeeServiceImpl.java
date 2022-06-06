package me.rallings.javaday25crud_db.service;

import me.rallings.javaday25crud_db.model.Employee;
import me.rallings.javaday25crud_db.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}