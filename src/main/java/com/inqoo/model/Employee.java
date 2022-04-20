package com.inqoo.model;

import lombok.Data;

@Data
public class Employee {
    private String employeeName;
    private double monthlySalary;

    private Position position;

    public Employee(String employeeName, double monthlySalary, Position position) {
        this.employeeName = employeeName;
        this.monthlySalary = monthlySalary;
        this.position = position;
    }
}

