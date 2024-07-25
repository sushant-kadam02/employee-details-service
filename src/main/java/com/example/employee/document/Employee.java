package com.example.employee.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "TAB_EMPLOYEE")
public class Employee {

    @Id
    private String id;

    private String empName;

    private String empId;

    private String deptName;

    private int age;

    private EmployeeAddress address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EmployeeAddress getAddress() {
        return address;
    }

    public void setAddress(EmployeeAddress address) {
        this.address = address;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", empName='" + empName + '\'' +
                ", deptName='" + deptName + '\'' +
                ", empId='" + empId + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
