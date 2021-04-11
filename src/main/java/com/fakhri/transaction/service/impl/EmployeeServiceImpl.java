package com.fakhri.transaction.service.impl;

import com.fakhri.transaction.dto.EmployeeRequestDto;
import com.fakhri.transaction.model.Department;
import com.fakhri.transaction.model.Employee;
import com.fakhri.transaction.repository.DepartmentRepository;
import com.fakhri.transaction.repository.EmployeeRepository;
import com.fakhri.transaction.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public String saveEmployee(EmployeeRequestDto employeeRequestDto) {

        Department department = new Department();
        department.setDepartmentName(employeeRequestDto.getDepartmentName());
        department.setDepartmentCode(employeeRequestDto.getDepartmentName());

        Long departmentId = departmentRepository.save(department)
                .getDepartmentId();

        // Contoh berhasil
        Employee employee = new Employee();

        // Contoh gagal untuk percobaan fitur rollback transactional
//        Employee employee = null;


        employee.setEmpName(employeeRequestDto.getEmpName());
        employee.setEmail(employeeRequestDto.getEmail());
        employee.setDepartmentId(departmentId);

        employeeRepository.save(employee);

        return "Employee is saved with Employee ID : " + employee.getEmployeeId();
    }
}
