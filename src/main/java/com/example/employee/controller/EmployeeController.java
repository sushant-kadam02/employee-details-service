package com.example.employee.controller;

import com.example.employee.document.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    private ResponseEntity<Employee> getEmployeeDetails(@PathVariable("id") String id) {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            return ResponseEntity.status(HttpStatus.OK).body(employee);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping("/employee")
    private List<Employee> getListEmployees() {
        return employeeService.getListEmployees();
    }

    @PostMapping("/employees/add")
    private ResponseEntity<String> storeEmployeeDetails() {

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
