package com.inqoo.model.costs;

import lombok.Data;

@Data
public class Salary {
    private String employeeName;
    private double monthlySalary;

    public Salary(String employeeName, double monthlySalary) {
        this.employeeName = employeeName;
        this.monthlySalary = monthlySalary;
    }
}

