package com.inqoo.model.costs;

import lombok.Data;

@Data
public class Employee {
    private String employeeName;
    private double monthlySalary;

    public Employee(String employeeName, double monthlySalary) {
        this.employeeName = employeeName;
        this.monthlySalary = monthlySalary;
    }
}

