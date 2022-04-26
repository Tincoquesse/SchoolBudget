package com.inqoo.controller;

import com.inqoo.BudgetController;
import com.inqoo.model.Budget;
import com.inqoo.model.Employee;
import com.inqoo.model.Position;
import com.inqoo.model.Student;
import com.inqoo.repository.BudgetDAORepo;
import com.inqoo.view.BudgetView;

import java.time.LocalDate;

public class BudgetControllerImplementation implements BudgetController {

    private final Budget budget;
    private final BudgetView view;
    private final BudgetDAORepo budgetDAORepo;


    public BudgetControllerImplementation(Budget budget, BudgetView view, BudgetDAORepo budgetDAORepo) {
        this.budget = budget;
        this.view = view;
        this.budgetDAORepo = budgetDAORepo;
    }

    public void updateBudgetView(LocalDate localDate) {
        view.printBudgetDetails(budget.getStudentsTuitionSum(), budget.getTeacherSalariesSum(),
                budget.getAdministrationSalariesSum(), budget.getBuildingCosts(localDate),
                budget.getBudgetBalance(), budget.getNumberOfClasses(),
                budgetDAORepo.getAllTeachers().size(),
                budgetDAORepo.getAllAdministrationEmployee().size());
    }

    @Override
    public void setMonthlyTuition(double monthlyTuition) {
        for (Student student : budgetDAORepo.getAllStudents()) {
            student.setMonthlyTuition(monthlyTuition);
        }
    }

    @Override
    public void addStudent(Student student) {
        int maxStudentsNumber = budget.getClassSize() * 5;

        if (budgetDAORepo.getAllStudents().size() < maxStudentsNumber) {
            budgetDAORepo.addStudent(student);
            budget.setNumberOfClasses((budgetDAORepo.getAllStudents().size() - 1) / budget.getClassSize() + 1);
        } else {
            System.out.println("Too many Students!");
        }
        while (budget.getNumberOfClasses() > budgetDAORepo.getAllTeachers().size()) {
            addEmployee(new Employee("Default Teacher", 6000.0, Position.TEACHER));
        }
        while (budget.getAdministrationEmployeeNumber() > budgetDAORepo.getAllAdministrationEmployee().size()) {
            addEmployee(new Employee("Default Administration", 6000.0, Position.ADMINISTRATION));
        }
    }

    @Override
    public void addEmployee(Employee employee) {
        budgetDAORepo.addEmployee(employee);
    }

    @Override
    public void setClassSize(int classSize) {
        budget.setClassSize(classSize);
    }

    @Override
    public void setNumberOfClasses(int numberOfClasses) {
        budget.setNumberOfClasses(numberOfClasses);
    }

    @Override
    public void setTeachersSalary(double teacherSalary) {
        budget.setTeachersSalary(teacherSalary);
    }

    @Override
    public void setAdministrationSalary(double administrationSalary) {
        budget.setAdministrationSalary(administrationSalary);
    }
}
