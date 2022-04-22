package com.inqoo;


import com.inqoo.controller.BudgetControllerImplementation;
import com.inqoo.model.Budget;
import com.inqoo.model.Employee;
import com.inqoo.model.Position;
import com.inqoo.model.Student;
import com.inqoo.repository.BudgetDAORepo;
import com.inqoo.view.BudgetView;

public class MVCMain {
    public static void main(String[] args) {

        BudgetDAORepo budgetDAORepo = new BudgetDAORepo();
        Budget budget = new Budget(budgetDAORepo);
        BudgetView budgetView = new BudgetView();
        BudgetControllerImplementation budgetController = new BudgetControllerImplementation(budget, budgetView, budgetDAORepo);

        for (int i = 1; i <= 31; i++) {
            budgetController.addStudent(new Student("Kamil Kotlarz", 1000.0));
        }
        budgetController.addEmployee(new Employee("John Snow", 6000.0, Position.TEACHER));
        budgetController.addEmployee(new Employee("John Snow", 6000.0, Position.ADMINISTRATION));
        budgetController.updateBudgetView();
        System.out.println(budget.getNumberOfClasses());

    }
}
