package com.javaguides.personnel_expense_app.service;

import com.javaguides.personnel_expense_app.dto.ExpenseDto;

import java.util.List;

public interface ExpenseService {
    public ExpenseDto createExpense(ExpenseDto expenseDto);
    public ExpenseDto expensebyid1(Long id);
    public List<ExpenseDto> allExpense();
    public ExpenseDto updateExpense(Long id, ExpenseDto expenseDto);
    public void expenseDelete(Long id);
}
