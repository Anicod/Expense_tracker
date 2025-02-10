package com.javaguides.personnel_expense_app.dto;

import com.javaguides.personnel_expense_app.entity.Catagory;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ExpenseDto(Long id, BigDecimal amount, LocalDate localDate, CatagoryDto catagoryDto) {
}
