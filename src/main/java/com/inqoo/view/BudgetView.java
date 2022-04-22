package com.inqoo.view;

public class BudgetView {

    public void printBudgetDetails(double tuitions, double teachersSalary,
                                   double administrationSalary,
                                   double buildingCosts, double balance) {

        System.out.println("Budget Details: ");
        System.out.println("Students Tuition: " + tuitions);
        System.out.println("Teachers Salary: " + teachersSalary);
        System.out.println("Administration Salary: " + administrationSalary);
        System.out.println("Building Costs: " + buildingCosts);
        System.out.println("Balance: " + balance + "\n");
    }

}
