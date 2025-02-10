package com.javaguides.personnel_expense_app.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
        description = "Catagory DTO(Data Transfer Object) for Catagory resource"
)
public record CatagoryDto(Long id, String name) {
}
