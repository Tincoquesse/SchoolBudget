package com.inqoo;

import java.time.LocalDate;

public interface Budget {

    void setNumberOfClasses(int numberOfClasses);

    double getAdministrationSalariesSum();

    double getTeacherSalariesSum();

    double getStudentsTuitionSum();

    double getBuildingCosts(LocalDate localDate);

    double getBudgetBalance();

    void setAdministrationEmployeeNumber();


}
