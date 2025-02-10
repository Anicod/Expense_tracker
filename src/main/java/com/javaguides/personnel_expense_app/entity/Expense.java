package com.javaguides.personnel_expense_app.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
@Entity
@Table(name = "Expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    BigDecimal amount;
    @Column(nullable = false)
    LocalDate localDate;
    @ManyToOne
     @JoinColumn(name = "catagory_id", nullable = false)
    Catagory catagory;

    public Expense(Long id, BigDecimal amount, LocalDate localDate, Catagory catagory) {
        this.id = id;
        this.amount = amount;
        this.localDate = localDate;
        this.catagory = catagory;
    }
public Expense(){

}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Catagory getCatagory() {
        return catagory;
    }

    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }
}
