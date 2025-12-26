package com.crud.test.service;

import com.crud.test.dto.EmployeeDto;
import com.crud.test.model.Employee;
import com.crud.test.repository.EmployeeRepository;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public @Nullable EmployeeDto getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Employee not found"));
        return new EmployeeDto(employee.getId(),employee.getName(),employee.getStream());
    }

    @Override
    public @Nullable EmployeeDto saveEmployeeData(EmployeeDto employeeDto) {
        Employee employee = new Employee();//employeeDto.getName(),employeeDto.getStream());
        employee.setName(employeeDto.getName());
        employee.setStream(employeeDto.getStream());
        Employee saved = employeeRepository.save(employee);
        return new EmployeeDto(saved.getId(),saved.getName(),saved.getStream());
    }

    @Override
    public @Nullable EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Employee not found"));
        employee.setName(employeeDto.getName());
        employee.setStream(employeeDto.getStream());
        Employee updated = employeeRepository.save(employee);
        return new EmployeeDto(updated.getId(),updated.getName(),updated.getStream());
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<EmployeeDto> findAllEmployee() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream()
                .map(m->new EmployeeDto(m.getId(),m.getName(),m.getStream()))
                .toList();
    }
}
