package com.inqoo.model;

import lombok.Data;

@Data
public class Student {
    private String studentName;
    private double monthlyTuition;

    public Student(String studentName, double monthlyTuition) {
        this.studentName = studentName;
        this.monthlyTuition = monthlyTuition;
    }
}
