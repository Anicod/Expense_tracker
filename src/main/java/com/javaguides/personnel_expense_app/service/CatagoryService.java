package com.javaguides.personnel_expense_app.service;

import com.javaguides.personnel_expense_app.dto.CatagoryDto;

import java.util.List;

public interface CatagoryService {
    public CatagoryDto createCat(CatagoryDto catagoryDto);
    public List<CatagoryDto> getAllCategory();
    public CatagoryDto getByIdCatagory(Long id);
    public CatagoryDto updateCatogry(CatagoryDto catagoryDto, Long id);
    public void deletebyid(Long id);
}
