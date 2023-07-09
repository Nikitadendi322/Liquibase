package com.example.liquibase.Service;

import com.example.liquibase.Employee.Employee;
import com.example.liquibase.dto.EmployeeDto;
import com.example.liquibase.dto.PositionDto;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {


    public Employee toEntity(EmployeeDto employeeDto){
        Employee employee=new Employee();
        employee.setName(employee.getName());
        employee.setSalary(employee.getSalary());
        var positionDto=employeeDto.getPosition();
        return employee;
    }
    public EmployeeDto toDto(Employee employee){
        EmployeeDto employeeDto=new EmployeeDto();
        employeeDto.setId(employeeDto.getId());
        employeeDto.setName(employeeDto.getName());
        employeeDto.setSalary(employeeDto.getSalary());
        var position=employee.getPosition();
        var positionDto=new PositionDto(position.getId(), position.getPosition());
        employeeDto.setPosition(positionDto);
        return employeeDto;
    }
}