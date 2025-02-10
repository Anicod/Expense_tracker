package com.javaguides.personnel_expense_app.controller;

import com.javaguides.personnel_expense_app.dto.CatagoryDto;
import com.javaguides.personnel_expense_app.service.CatagoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(
        name = "REST API Catagory API documentation",
        description = "REST API Catagory API documentation"
)
@RestController
public class CatagoryController {
    @Autowired
    CatagoryService catagoryService;
    @Operation(
            summary = "REST API for catagory",
            description = "REST API for catagory"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP status 201 created"
    )
    @PostMapping("/create")
    public ResponseEntity<CatagoryDto> createCatagory(@RequestBody CatagoryDto catagoryDto){
        CatagoryDto catagoryDto1 = catagoryService.createCat(catagoryDto);
        return new ResponseEntity<>(catagoryDto1, HttpStatus.OK);
    }
    @Operation(
            summary = "REST API for get catagory",
            description = "REST API for get catagory"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP status 200 success"
    )
    @GetMapping("/allcatagory")
    public ResponseEntity<List<CatagoryDto>> getAllCatagory(){
        List<CatagoryDto> catagoryDtolst = catagoryService.getAllCategory();
        return new ResponseEntity<>(catagoryDtolst, HttpStatus.OK);
    }
    @Operation(
            summary = "REST API for get all catagory",
            description = "REST API for get all catagory"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP status 200 success"
    )
    @GetMapping("/catagory/{id}")
    public ResponseEntity<CatagoryDto> getCatagoryByid(@PathVariable Long id){
        CatagoryDto catagoryDto = catagoryService.getByIdCatagory(id);
        return new ResponseEntity<>(catagoryDto, HttpStatus.OK);
    }
    @Operation(
            summary = "REST API for update catagory",
            description = "REST API for update catagory"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP status 200 OK"
    )
    @PutMapping("catagoryupdate/{id}")
    public  ResponseEntity<CatagoryDto> updateByid(@RequestBody CatagoryDto catagoryDto, @PathVariable Long id){
        CatagoryDto catagoryDto1 = catagoryService.updateCatogry(catagoryDto, id);
        return new ResponseEntity<>(catagoryDto1, HttpStatus.OK);
    }
    @Operation(
            summary = "REST API for delete catagory",
            description = "REST API for catagory"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP status 200 OK"
    )
    @DeleteMapping("delete/{id}")
    public String deleteCatogory(@PathVariable Long id){
        catagoryService.deletebyid(id);
        return "Delete successfully";
    }

}
