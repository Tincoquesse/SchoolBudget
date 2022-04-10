package com.inqoo.model;

import lombok.Data;

import java.util.HashMap;
import java.util.HashSet;

@Data
public class Budget {
    private HashSet<Double> incomes;
    private HashSet<Double> costs;

    public void addSalaryToCost(){

    }
}
