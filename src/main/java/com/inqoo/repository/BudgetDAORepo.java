package com.inqoo.repository;

import com.inqoo.BudgetDAO;
import com.inqoo.model.Employee;
import com.inqoo.model.Student;

import java.util.ArrayList;
import java.util.List;

public class BudgetDAORepo implements BudgetDAO {

    private List<Student> students = new ArrayList<>(50);
    private List<Employee> employees = new ArrayList<>(5);


    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void addEmployee(Employee employee) {

        employees.add(employee);
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return new ArrayList<>(employees);
    }
}
