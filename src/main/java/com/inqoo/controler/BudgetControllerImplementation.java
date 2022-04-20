package com.inqoo.controller;

import com.inqoo.model.Budget;
import com.inqoo.model.costs.Employee;
import com.inqoo.model.incomes.Student;
import com.inqoo.view.BudgetView;

public class BudgetController {

    private Budget budget;
    private BudgetView view;

    public BudgetController(Budget budget, BudgetView view) {
        this.budget = budget;
        this.view = view;
    }

    public void addSalaryToBudget(Employee salary) {
        this.budget.addEmployeeToPayroll(salary);
        System.out.println("Salary added to Costs!");
    }

    public void addTuitionToBudget(Student tuition) {
        this.budget.addStudentToStudentsList(tuition);
        System.out.println("Tuition added to Incomes!");
    }

    public void updateBudgetView(){
        view.printBudgetDetails(budget.getStudentsList(), budget.getPayroll(), budget.getBalance());
    }
}
