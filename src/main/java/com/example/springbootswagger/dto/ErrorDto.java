package com.example.springbootswagger.dto;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "error", description = "This is a error model")
public class ErrorDto {
    private String status;
    private String code;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
