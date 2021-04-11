package com.fakhri.transaction.service;

import com.fakhri.transaction.dto.EmployeeRequestDto;
import com.fakhri.transaction.repository.DepartmentRepository;
import com.fakhri.transaction.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface EmployeeService {

    public String saveEmployee(EmployeeRequestDto employeeRequestDto);
}
