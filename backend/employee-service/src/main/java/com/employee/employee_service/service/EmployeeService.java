package com.employee.employee_service.service;

import com.employee.employee_service.dto.EmployeeRequest;
import com.employee.employee_service.dto.EmployeeResponse;
import com.employee.employee_service.entity.Employee;

import java.util.List;

public interface EmployeeService {

    EmployeeResponse createEmployee(EmployeeRequest request);

    List<EmployeeResponse> getAllEmployees();

    EmployeeResponse getEmployeeById(Long id);

    EmployeeResponse updateEmployee(Long id, EmployeeRequest request);

    void deleteEmployee(Long id);
}