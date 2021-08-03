package com;

import java.io.Serializable;

public class Employee implements Serializable {
    public String empName;
    public int empId;
    public Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

}
