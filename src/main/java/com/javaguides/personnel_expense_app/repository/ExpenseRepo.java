package com.javaguides.personnel_expense_app.repository;

import com.javaguides.personnel_expense_app.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepo extends JpaRepository<Expense, Long> {
}
