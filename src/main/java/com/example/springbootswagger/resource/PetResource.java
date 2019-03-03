package com.example.springbootswagger.resource;

import com.example.springbootswagger.dto.ErrorDto;
import com.example.springbootswagger.dto.PetDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetResource {

    @ApiOperation(value = "This Resource fetch all reserved pets")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "Pet not found")})
    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<PetDto> pets() {
        return new ArrayList<>();
    }

    @ApiOperation(value = "This Resource fetch a pet by id")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Id supplied", response = ErrorDto.class), @ApiResponse(code = 404, message = "Pet not found")})
    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public PetDto pet(@PathVariable String id) {
        return new PetDto();
    }

    @ApiOperation(value = "This Resource update a pet by id")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Id supplied"), @ApiResponse(code = 404, message = "Pet not found")})
    @PutMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void updatePet(@PathVariable String id) {
        return;
    }

    @ApiOperation(value = "This Resource registry a pet")
    @ApiResponses(value = {@ApiResponse(code = 403, message = "Access Forbidden"), @ApiResponse(code = 404, message = "Pet not found")})
    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public int insertPet(
            @ApiParam(value = "this pet is submitted by forms", required = true)
            @RequestBody PetDto pet) {
        return 1;
    }

    @ApiOperation(value = "This Resource delete a pet by id")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Id supplied"), @ApiResponse(code = 403, message = "Access Forbidden"), @ApiResponse(code = 404, message = "Pet not found")})
    @DeleteMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deletePet(@PathVariable String id) {
        return;
    }
}
