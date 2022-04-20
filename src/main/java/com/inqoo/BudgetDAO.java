package com.inqoo;


import com.inqoo.model.Employee;
import com.inqoo.model.Student;

import java.util.List;

public interface BudgetDAO {

    void addStudent(Student student);
    void addEmploee(Employee employee);

    List<Student> getAllStudents();

    List<Employee> getAllEmployee();
}
