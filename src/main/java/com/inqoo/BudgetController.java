package com.inqoo;

import com.inqoo.model.Employee;
import com.inqoo.model.Student;

public interface BudgetController {

    void setMonthlyTuition(double monthlyTuition);
    void addStudent(Student student);
    void addEmployee(Employee employee);
    void setClassSize(double classSize);


}
