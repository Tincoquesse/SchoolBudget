package com.inqoo.model;

import java.util.HashSet;


public class Budget {
    private final HashSet<Employee> payroll = new HashSet<>();
    private final HashSet<Student> studentsList = new HashSet<>();

    public void addEmployeeToPayroll(Employee employee) {
        payroll.add(employee);
    }

    public void addStudentToStudentsList(Student student) {
        studentsList.add(student);
    }

    public double getPayroll() {
        double sum = 0;
        for (Employee e: payroll){
            sum += e.getMonthlySalary();
        }
        return sum;
    }

    public double getStudentsList() {
        double sum = 0;
        for (Student s: studentsList){
            sum += s.getMonthlyTuition();
        }
        return sum;
    }
    public double getBalance() {
        return getStudentsList() - getPayroll();
    }
}
