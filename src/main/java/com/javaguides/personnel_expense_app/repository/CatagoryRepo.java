package com.javaguides.personnel_expense_app.repository;

import com.javaguides.personnel_expense_app.entity.Catagory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatagoryRepo extends JpaRepository<Catagory, Long> {

}
