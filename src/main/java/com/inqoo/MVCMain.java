package com.inqoo;

import com.inqoo.controller.BudgetController;
import com.inqoo.model.Budget;
import com.inqoo.model.costs.Employee;
import com.inqoo.model.incomes.Student;
import com.inqoo.view.BudgetView;

public class MVCMain {
    public static void main(String[] args) {

        Budget budget = new Budget();
        BudgetView budgetView = new BudgetView();
        BudgetController budgetController = new BudgetController(budget, budgetView);


        Employee teacher1 = new Employee("John Snow", 2435);
        Employee teacher2 = new Employee("Rafał Brzozowski", 5432);
        Student student1 = new Student("Kamil Kotlarz", 1222);
        Student student2 = new Student("Jan Nowak", 10000);

        budgetController.addSalaryToBudget(teacher1);
        budgetController.addSalaryToBudget(teacher2);
        budgetController.addTuitionToBudget(student1);
        budgetController.addTuitionToBudget(student2);

        budgetController.updateBudgetView();




    }
}
