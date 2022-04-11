package com.inqoo.model;

import com.inqoo.model.costs.Employee;
import com.inqoo.model.incomes.Student;
import java.util.HashSet;


public class Budget {
    private HashSet<Employee> payroll = new HashSet<>();
    private HashSet<Student> studentsList = new HashSet<>();

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
