package com.example.employee.service;

import com.example.employee.document.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    public Employee getEmployeeById(String id) {
        Employee employee = null;
        Criteria criteria = Criteria.where("empId").is(id);
        Query searchQuery = new Query(criteria);
        List<Employee> employeeList = mongoTemplate.find(searchQuery, Employee.class);
        return employee = employeeList.get(0) == null ? null : employeeList.get(0);
    }



    public List<Employee> getListEmployees() {
        List<Employee> employeeList = mongoTemplate.findAll(Employee.class);
        return employeeList;
    }


}
