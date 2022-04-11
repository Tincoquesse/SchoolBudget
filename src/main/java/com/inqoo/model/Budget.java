package com.inqoo.model;

import com.inqoo.model.costs.Salary;
import com.inqoo.model.incomes.Tuition;
import java.util.HashSet;


public class Budget {
    private HashSet<Double> incomes = new HashSet<>();
    private HashSet<Double> costs = new HashSet<>();

    public void addSalaryToCost(Salary salary) {
        costs.add(salary.getMonthlySalary());
    }

    public void addTuitionToIncomes(Tuition tuition) {
        incomes.add(tuition.getMonthlyTuition());
    }

    public double getIncomes() {
        double sum = 0;
        for (double d: incomes){
            sum += d;
        }
        return sum;
    }

    public double getCosts() {
        double sum = 0;
        for (double d: costs){
            sum += d;
        }
        return sum;
    }
    public double getBalance() {
        return getIncomes() - getCosts();
    }
}
