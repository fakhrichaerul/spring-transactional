package com.fakhri.transaction.controller;

import com.fakhri.transaction.dto.EmployeeRequestDto;
import com.fakhri.transaction.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public String saveEmployee(@RequestBody EmployeeRequestDto employeeRequestDto){

        return employeeService.saveEmployee(employeeRequestDto);
    }
}
