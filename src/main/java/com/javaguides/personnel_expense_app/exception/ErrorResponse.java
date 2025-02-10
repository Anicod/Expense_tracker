package com.javaguides.personnel_expense_app.exception;

import java.time.LocalDate;

public record ErrorResponse(String erResp, String errcd, String path, LocalDate localDate) {
}
