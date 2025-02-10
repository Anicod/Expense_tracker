package com.javaguides.personnel_expense_app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ExpenseHandler.class)
    public ResponseEntity<ErrorResponse> notfound(ExpenseHandler e, WebRequest webRequest){
        ErrorResponse errorResponse = new ErrorResponse(e.getMessage(), "not found", webRequest.getDescription(false), LocalDate.now());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> runtime(Exception e, WebRequest webRequest){
        ErrorResponse errorResponse = new ErrorResponse(e.getMessage(), "INTERNAL_SERVER_ERROR", webRequest.getDescription(false), LocalDate.now());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
