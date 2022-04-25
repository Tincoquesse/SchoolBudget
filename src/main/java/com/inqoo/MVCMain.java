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

        for (int i = 1; i <= 20; i++) {
            budgetController.addStudent(new Student("Kamil Kotlarz", 1000.0));
        }

        budgetController.updateBudgetView(LocalDate.now());

        System.out.println("Liczba klas: " + budget.getNumberOfClasses());
        System.out.println("Liczba nauczycieli: " + budgetDAORepo.getAllTeachers().size());

        Double d = 3.49;
        System.out.println(d);
        System.out.println((int) Math.round(d));

    }
}
