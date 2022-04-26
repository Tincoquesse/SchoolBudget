package com.inqoo;

import com.inqoo.controller.BudgetControllerImplementation;
import com.inqoo.model.Budget;
import com.inqoo.model.Student;
import com.inqoo.repository.BudgetDAORepo;
import com.inqoo.view.BudgetView;

import java.time.LocalDate;

public class MVCMain {
    public static void main(String[] args) {

        BudgetDAORepo budgetDAORepo = new BudgetDAORepo();
        Budget budget = new Budget(budgetDAORepo);
        BudgetView budgetView = new BudgetView();
        BudgetControllerImplementation budgetController = new BudgetControllerImplementation(budget, budgetView, budgetDAORepo);

        budgetController.setClassSize(20);

        /* ZAPEŁNIAM LISTĘ STUDENTÓW */
        for (int i = 1; i <= 13; i++) {
            budgetController.addStudent(new Student("Default Student", 1595));
        }
        budgetController.updateBudgetView(LocalDate.now());
    }
}
