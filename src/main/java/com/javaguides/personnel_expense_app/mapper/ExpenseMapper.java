package com.javaguides.personnel_expense_app.mapper;

import com.javaguides.personnel_expense_app.dto.CatagoryDto;
import com.javaguides.personnel_expense_app.dto.ExpenseDto;
import com.javaguides.personnel_expense_app.entity.Catagory;
import com.javaguides.personnel_expense_app.entity.Expense;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ExpenseMapper {
    public static ExpenseDto expenseDto(Expense expense){
        ExpenseDto expenseDto1 = new ExpenseDto(expense.getId(), expense.getAmount(), expense.getLocalDate(), new CatagoryDto(expense.getCatagory().getId(), expense.getCatagory().getName()));
        return  expenseDto1;
    }
    public static Expense expense(ExpenseDto expenseDto){
        Catagory catagory = new Catagory();
        catagory.setId(expenseDto.catagoryDto().id());
        Expense expense1 = new Expense(expenseDto.id(), expenseDto.amount(), expenseDto.localDate(), catagory);
        return expense1;
    }
}
