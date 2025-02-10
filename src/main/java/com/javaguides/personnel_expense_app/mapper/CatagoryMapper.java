package com.javaguides.personnel_expense_app.mapper;

import com.javaguides.personnel_expense_app.dto.CatagoryDto;
import com.javaguides.personnel_expense_app.entity.Catagory;

public class CatagoryMapper {
    public static Catagory getCatagory(CatagoryDto catagoryDto){
        return new Catagory(catagoryDto.id(), catagoryDto.name());
    }
    public static CatagoryDto getCataogoryDto(Catagory catagory){
        return new CatagoryDto(catagory.getId(), catagory.getName());
    }
}
