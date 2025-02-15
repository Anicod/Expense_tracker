package com.javaguides.personnel_expense_app.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Catagory")
public class Catagory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false, unique = true)
    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Catagory(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Catagory(){

    }
}
