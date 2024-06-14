package com.example.mgs.service;

import com.example.mgs.model.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {
    private final Map<String, Employee> employeeMap = new HashMap<>();
    
    // Método para adicionar um novo funcionário
    public Employee addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
        return employee;
    }
 
    // Método para obter um funcionário pelo ID
    public Employee getEmployeeById(String id) {
        return employeeMap.get(id);
    }
}