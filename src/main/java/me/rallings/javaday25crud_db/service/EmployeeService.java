package me.rallings.javaday25crud_db.service;

import me.rallings.javaday25crud_db.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployees();
}
