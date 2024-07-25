package com.example.employee.controller;

import com.example.employee.document.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    private ResponseEntity<Employee> getEmployeeDetails(@PathVariable("id") int id) {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            return ResponseEntity.status(HttpStatus.OK).body(employee);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @PostMapping("/employees/add")
    private ResponseEntity<String> storeEmployeeDetails() {

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
