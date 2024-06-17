package com.example.mgs.service;

import com.example.mgs.model.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;

@Service
public class EmployeeService {
    private final Map<String, Employee> employeeMap = new HashMap<>();
    
    // Método para adicionar um novo funcionário
    public Employee addEmployee(@Valid Employee employee) {
        // Validar os dados do funcionário antes de adicionar
        if (employee.getId() == null || employee.getId().isEmpty()) {
            throw new IllegalArgumentException("O ID do funcionário é obrigatório.");
        }
        if (employee.getNome() == null || employee.getNome().isEmpty()) {
            throw new IllegalArgumentException("O nome do funcionário é obrigatório.");
        }
        if (employee.getTelefone() == null || employee.getTelefone().isEmpty()) {
            throw new IllegalArgumentException("Pelo menos um número de telefone é obrigatório.");
        }
        if (employee.getEmail() == null || employee.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Pelo menos um e-mail é obrigatório.");
        }
        
        employeeMap.put(employee.getId(), employee);
        return employee;
    }
 
    // Método para obter um funcionário pelo ID
    public Employee getEmployeeById(String id) {
        return employeeMap.get(id);
    }
}
