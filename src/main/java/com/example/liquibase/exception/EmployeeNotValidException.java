package com.example.liquibase.exception;

import com.example.liquibase.dto.EmployeeDto;

public class EmployeeNotValidException extends RuntimeException {

    private final EmployeeDto employee;

    public EmployeeNotValidException(EmployeeDto employee) {
        this.employee = employee;
    }

    public EmployeeDto getEmployee() {
        return employee;
    }
}
