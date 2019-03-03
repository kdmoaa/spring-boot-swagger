package com.example.springbootswagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "pet", description = "This is a pet model")
public class PetDto {
    @ApiModelProperty(value = "This is a name")
    private String name;
    @ApiModelProperty(value = "This is a kind, which is include 1, 2 or 3")
    private String kind;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public PetDto(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    public PetDto() {
    }
}
