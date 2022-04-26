package com.inqoo.view;

public class BudgetView {

    public void printBudgetDetails(double tuitions, double teachersSalary,
                                   double administrationSalary,
                                   double buildingCosts, double balance, int numberOfClasses, int allTeachersNumber, int allAdministrationNumber) {

        double percent = (balance / tuitions) * 100;

        System.out.printf("Number of Classes: %s\n", numberOfClasses);
        System.out.printf("Number of Teachers: %s\n", allTeachersNumber);
        System.out.printf("Number of Administration Employees: %s\n\n", allAdministrationNumber);

        System.out.println("Budget Details: ");
        System.out.printf("Students Tuition: %s\n", tuitions);
        System.out.printf("Teachers Salary: %s\n", teachersSalary);
        System.out.printf("Administration Salary: %s\n", administrationSalary);
        System.out.printf("Building Costs: %s\n", buildingCosts);
        System.out.printf("Balance: %s, profit percentage: %.2f\n\n", balance, percent);
    }

}
