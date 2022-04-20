package com.inqoo.controler;

import com.inqoo.model.Budget;
import com.inqoo.model.Employee;
import com.inqoo.model.Student;
import com.inqoo.view.BudgetView;

public class BudgetControllerImplementation {

    private Budget budget;
    private BudgetView view;

    public BudgetControllerImplementation(Budget budget, BudgetView view) {
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
