package com.javaguides.personnel_expense_app.service.impl;

import com.javaguides.personnel_expense_app.dto.ExpenseDto;
import com.javaguides.personnel_expense_app.entity.Catagory;
import com.javaguides.personnel_expense_app.entity.Expense;
import com.javaguides.personnel_expense_app.mapper.ExpenseMapper;
import com.javaguides.personnel_expense_app.repository.ExpenseRepo;
import com.javaguides.personnel_expense_app.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    @Autowired
    ExpenseRepo expenseRepo;
    @Override
    public ExpenseDto createExpense(ExpenseDto expenseDto) {
        //convert to expenseDto to expense
        Expense expense = ExpenseMapper.expense(expenseDto);
        Expense expense1 = expenseRepo.save(expense);
        return ExpenseMapper.expenseDto(expense1);
    }
    public ExpenseDto expensebyid1(Long id){
        Expense expense = expenseRepo.findById(id).orElseThrow(()-> new RuntimeException("not exsist"));
        return ExpenseMapper.expenseDto(expense);
    }

    @Override
    public List<ExpenseDto> allExpense() {
        List<Expense> allexpense = expenseRepo.findAll();
        List<ExpenseDto> expenseDtoList = allexpense.stream().map((ex)->convert(ex)).collect(Collectors.toList());
        return expenseDtoList;
    }

    @Override
    public ExpenseDto updateExpense(Long id, ExpenseDto expenseDto) {
        Expense expense = expenseRepo.findById(id).orElseThrow(()->new RuntimeException("not exsist"));
        expense.setAmount(expenseDto.amount());
        expense.setCatagory(new Catagory(expenseDto.catagoryDto().id(), expenseDto.catagoryDto().name()));
        Expense expense1 = expenseRepo.save(expense);
        return ExpenseMapper.expenseDto(expense1);
    }

    public ExpenseDto convert(Expense expense){
        return ExpenseMapper.expenseDto(expense);
    }
    public void expenseDelete(Long id){
        expenseRepo.deleteById(id);
    }


}
