package com.example.mgs.controller;

import com.example.mgs.model.Employee;
import com.example.mgs.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Método para adicionar um novo funcionário
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        // Chama o método addEmployee do serviço de funcionários e retorna o funcionário adicionado
        return employeeService.addEmployee(employee); 
    }

    // Método para obter um funcionário pelo ID
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        // Chama o método getEmployeeById do serviço de funcionários e retorna o funcionário correspondente ao ID fornecido
        return employeeService.getEmployeeById(id); 
    }
    
    
}