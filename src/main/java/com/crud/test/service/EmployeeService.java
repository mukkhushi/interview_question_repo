package com.crud.test.service;

import com.crud.test.dto.EmployeeDto;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface EmployeeService {
    @Nullable EmployeeDto getEmployeeById(Long id);

    @Nullable EmployeeDto saveEmployeeData(EmployeeDto employeeDto);

    @Nullable EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);

    void deleteEmployee(Long id);

    List<EmployeeDto> findAllEmployee();
}
