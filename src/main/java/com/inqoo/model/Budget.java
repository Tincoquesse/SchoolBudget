package com.inqoo.model;

import com.inqoo.repository.BudgetDAORepo;
import lombok.Data;


@Data
public class Budget implements com.inqoo.Budget {

    private BudgetDAORepo budgetDAORepo;

    private double studentsTuitionSum;
    private double teacherSalariesSum;
    private double administrationSalariesSum;
    private double buildingCosts;

    private int classSize = 10;
    private int numberOfClasses = 1;

    public Budget(BudgetDAORepo budgetDAORepo) {
        this.budgetDAORepo = budgetDAORepo;
    }

    @Override
    public double getBudgetBalance() {
        return studentsTuitionSum - teacherSalariesSum - administrationSalariesSum - buildingCosts;
    }

    public double getAdministrationSalariesSum() {
        for (Employee employee : budgetDAORepo.getAllEmployee()) {
            if (employee.getPosition() == Position.ADMINITRATION) {
                administrationSalariesSum += employee.getMonthlySalary();
            }
        }
        return administrationSalariesSum;
    }

    public double getStudentsTuitionSum() {
        studentsTuitionSum = 0;
        for (Student student : budgetDAORepo.getAllStudents()) {
            studentsTuitionSum += student.getMonthlyTuition();
        }
        return studentsTuitionSum;
    }

    public double getBuildingCosts() {
        buildingCosts = 0;
        buildingCosts = numberOfClasses * 2500;
        return buildingCosts;
    }

    public double getTeacherSalariesSum() {
        teacherSalariesSum = 0;
        for (Employee employee : budgetDAORepo.getAllEmployee()) {
            if (employee.getPosition() == Position.TEACHER) {
                teacherSalariesSum += employee.getMonthlySalary();
            }
        }
        return teacherSalariesSum;
    }
}
