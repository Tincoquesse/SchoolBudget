package com.inqoo.repository;

import com.inqoo.BudgetDAO;
import com.inqoo.model.Employee;
import com.inqoo.model.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BudgetDAORepo implements BudgetDAO {

    private Set<Student> students = new HashSet<>();
    private List<Employee> employees = new ArrayList<>();


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
        return new ArrayList<>();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return new ArrayList<>(employees);
    }
}
