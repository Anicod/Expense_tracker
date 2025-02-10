package com.javaguides.personnel_expense_app.service.impl;

import com.javaguides.personnel_expense_app.dto.CatagoryDto;
import com.javaguides.personnel_expense_app.entity.Catagory;
import com.javaguides.personnel_expense_app.exception.ExpenseHandler;
import com.javaguides.personnel_expense_app.mapper.CatagoryMapper;
import com.javaguides.personnel_expense_app.repository.CatagoryRepo;
import com.javaguides.personnel_expense_app.service.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CatogoryServiceImpl implements CatagoryService {
    @Autowired
    CatagoryRepo catagoryRepo;
    @Override
    public CatagoryDto createCat(CatagoryDto catagoryDto) {
        Catagory catagory = CatagoryMapper.getCatagory(catagoryDto);
        Catagory catagory1 = catagoryRepo.save(catagory);
        return CatagoryMapper.getCataogoryDto(catagory1);

    }

    @Override
    public List<CatagoryDto> getAllCategory() {
        List<Catagory> catagories = catagoryRepo.findAll();
        return catagories.stream().map((el)->(covert(el))).collect(Collectors.toList());
    }
//
    @Override
    public CatagoryDto getByIdCatagory(Long id) {
        Catagory catagory = catagoryRepo.findById(id).orElseThrow(()->new ExpenseHandler("not found"));
        return CatagoryMapper.getCataogoryDto(catagory);
    }
//
    @Override
    public CatagoryDto updateCatogry(CatagoryDto catagoryDto, Long id) {
        Catagory catagory = catagoryRepo.findById(id).orElseThrow(()->new ExpenseHandler("not found"));
        catagory.setName(catagoryDto.name());
        Catagory catagory1 = catagoryRepo.save(catagory);
        return CatagoryMapper.getCataogoryDto(catagory1);
    }

    @Override
    public void deletebyid(Long id) {
        catagoryRepo.deleteById(id);
    }
    public static CatagoryDto covert(Catagory catagory){
        return  CatagoryMapper.getCataogoryDto(catagory);
    }
}
