package com.inqoo.model.incomes;

import lombok.Data;

@Data
public class Tuition {
    private String studentName;
    private double monthlyTuition;

    public Tuition(String studentName, double monthlyTuition) {
        this.studentName = studentName;
        this.monthlyTuition = monthlyTuition;
    }
}
