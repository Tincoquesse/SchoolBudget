package com.inqoo.model;

import com.inqoo.repository.BudgetDAORepo;
import lombok.Data;

import java.time.LocalDate;


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

    public void setNumberOfClasses(int numberOfClasses) {
        if (numberOfClasses > 5) {
            numberOfClasses = 5;
        }
        this.numberOfClasses = numberOfClasses;
    }

    @Override
    public double getBudgetBalance() {
        return studentsTuitionSum - teacherSalariesSum - administrationSalariesSum - buildingCosts;
    }

    @Override
    public int setAdministrationEmployeeNumber() {
        int numberOfTeachersAndStudents = budgetDAORepo.getAllStudents().size()
                + budgetDAORepo.getAllTeachers().size();

        if (numberOfTeachersAndStudents < 20) {
            Double temp = numberOfTeachersAndStudents * 0.1;
            return (int) Math.round(temp);
        } else if (numberOfTeachersAndStudents < 37) {
            Double temp = numberOfTeachersAndStudents * 0.23;
            return (int) Math.round(temp);
        } else if (numberOfTeachersAndStudents < 50) {
            Double temp = numberOfTeachersAndStudents * 0.28;
            return (int) Math.round(temp);
        } else {
            Double temp = numberOfTeachersAndStudents * 0.33;
            return (int) Math.round(temp);
        }
    }

    public double getAdministrationSalariesSum() {
        administrationSalariesSum = 0;

        for (Employee employee : budgetDAORepo.getAllAdministrationEmployee()) {
            administrationSalariesSum += employee.getMonthlySalary();
        }
        return administrationSalariesSum * 0.7;
    }

    public double getStudentsTuitionSum() {
        studentsTuitionSum = 0;

        for (Student student : budgetDAORepo.getAllStudents()) {
            studentsTuitionSum += student.getMonthlyTuition();
        }
        return studentsTuitionSum;
    }

    public double getBuildingCosts(LocalDate localDate) {
        buildingCosts = 0;
        if (localDate.isAfter(LocalDate.of(2021, 9, 30)) &&
                localDate.isBefore(LocalDate.of(2022, 4, 1))) {
            buildingCosts = numberOfClasses * (2500 + 2000);
        } else {
            buildingCosts = numberOfClasses * 2500;
        }
        return buildingCosts;
    }

    public double getTeacherSalariesSum() {
        teacherSalariesSum = 0;

        for (Employee employee : budgetDAORepo.getAllTeachers()) {
            teacherSalariesSum += employee.getMonthlySalary();
        }
        return teacherSalariesSum;
    }
}
