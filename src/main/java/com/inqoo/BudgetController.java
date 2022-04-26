package com.inqoo;

import com.inqoo.model.Employee;
import com.inqoo.model.Student;

import java.time.LocalDate;

public interface BudgetController {

    void updateBudgetView(LocalDate localDate);

    void setMonthlyTuition(double monthlyTuition);

    void addStudent(Student student);

    void addEmployee(Employee employee);

    void setClassSize(int classSize);

    void setNumberOfClasses(int numberOfClasses);

    void setTeachersSalary(double teacherSalary);

    void setAdministrationSalary(double administrationSalary);


}
