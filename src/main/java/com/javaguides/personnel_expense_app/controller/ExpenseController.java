package com.javaguides.personnel_expense_app.controller;

import com.javaguides.personnel_expense_app.dto.ExpenseDto;
import com.javaguides.personnel_expense_app.service.ExpenseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(
        name = "Swagger API Expense Resource",
        description = "Swagger API Expense Resource"
)
public class ExpenseController {
    @Autowired
    ExpenseService expenseService;
    @Operation(
            summary = "create Expense for expense resouce",
            description = "create Expense for expense resouce"
    )
    @ApiResponse(
        responseCode = "201",
        description = "created HTTP status created"
    )
    @PostMapping("/expensecr")
    public ResponseEntity<ExpenseDto> createExpense(@RequestBody ExpenseDto expenseDto){
        ExpenseDto expenseDto1 = expenseService.createExpense(expenseDto);
        return new ResponseEntity<>(expenseDto1, HttpStatus.CREATED);
    }
    @Operation(
            summary = "GET Expense for expense resouce",
            description = "create Expense for expense resouce"
    )
    @ApiResponse(
            responseCode = "200",
            description = "created HTTP status OK"
    )
    @GetMapping("/expenseid/{id}")
    public ResponseEntity<ExpenseDto> expensebyid(@PathVariable Long id){
        ExpenseDto expenseDto = expenseService.expensebyid1(id);
        return new ResponseEntity<>(expenseDto, HttpStatus.OK);
    }
    @Operation(
            summary = "GET Expense for expense resouce",
            description = "create Expense for expense resouce"
    )
    @ApiResponse(
            responseCode = "200",
            description = "created HTTP status OK"
    )
    @GetMapping("/allexpense")
    public ResponseEntity<List<ExpenseDto>> allexp(){
        List<ExpenseDto> expenseDtoList = expenseService.allExpense();
        return new ResponseEntity<>(expenseDtoList, HttpStatus.OK);
    }
    @Operation(
            summary = "update Expense for expense resouce",
            description = "update Expense for expense resouce"
    )
    @ApiResponse(
            responseCode = "200",
            description = "created HTTP status OK"
    )
    @PutMapping("updateex/{id}")
    public ResponseEntity<ExpenseDto> updateex(@PathVariable Long id, @RequestBody ExpenseDto expenseDto){
        ExpenseDto expenseDto1 = expenseService.updateExpense(id, expenseDto);
        return new ResponseEntity<>(expenseDto1, HttpStatus.OK);
    }
    @Operation(
            summary = "delete Expense for expense resouce",
            description = "delete Expense for expense resouce"
    )
    @ApiResponse(
            responseCode = "200",
            description = "created HTTP status OK"
    )
    @DeleteMapping("/deleteex/{id}")
    public String deleteExpense(@PathVariable Long id){
        expenseService.expenseDelete(id);
        return "Expense delete successfully";
    }

}
