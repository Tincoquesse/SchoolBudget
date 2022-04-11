package com.inqoo.controller;

import com.inqoo.model.Budget;
import com.inqoo.view.BudgetView;

public class BudgetController {

    private Budget budget;
    private BudgetView view;

    public BudgetController(Budget budget, BudgetView view) {
        this.budget = budget;
        this.view = view;
    }



    public void updateBudgetView(){
        view.printBudgetDetails(budget.getIncomes(), budget.getCosts(), budget.getBalance());
    }
}
