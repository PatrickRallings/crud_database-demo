package me.rallings.javaday25crud_db.service;

import me.rallings.javaday25crud_db.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
}