package com.inqoo;

import com.inqoo.controller.BudgetController;
import com.inqoo.model.Budget;
import com.inqoo.model.costs.Salary;
import com.inqoo.model.incomes.Tuition;
import com.inqoo.view.BudgetView;

public class MVCMain {
    public static void main(String[] args) {

        Budget budget = new Budget();
        BudgetView budgetView = new BudgetView();

        Salary teacher1 = new Salary("John Snow", 2435.4);
        Salary teacher2 = new Salary("Rafał Brzozowski", 5432);
        Tuition student1 = new Tuition("Kamil Kotlarz", 1222);
        Tuition student2 = new Tuition("Jan Nowak", 666);

        budget.addTuitionToIncomes(student1);
        budget.addTuitionToIncomes(student2);
        budget.addSalaryToCost(teacher1);
        budget.addSalaryToCost(teacher2);

        BudgetController budgetController = new BudgetController(budget, budgetView);
        budgetController.updateBudgetView();




    }
}
