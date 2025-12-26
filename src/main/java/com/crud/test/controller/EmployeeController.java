package com.crud.test.controller;

import com.crud.test.dto.EmployeeDto;
import com.crud.test.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * fetch employee by id
     * @param id
     * @return employeeDto
     */
    @GetMapping("/{id}")
    ResponseEntity<EmployeeDto> getEmployee(@PathVariable Long id){
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    /**
     * create new employee
     * @param employeeDto
     * @return employeeDto
     */
    @PostMapping
    ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.saveEmployeeData(employeeDto));
    }

    /**
     * update exist employee
     * @param id
     * @param employeeDto
     * @return employeeDto
     */
    @PutMapping("/{id}")
    ResponseEntity<EmployeeDto> updateEmployee(@PathVariable Long id,@RequestBody EmployeeDto employeeDto){
        return ResponseEntity.ok(employeeService.updateEmployee(id,employeeDto));
    }

    /**
     * delete employee
     * @param id
     */
    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }

    /**
     * find all employee
     * @return List<EmployeeDto>
     */
    @GetMapping
    ResponseEntity<List<EmployeeDto>> findAllEmployee(){
        List<EmployeeDto> employeeDtoList = employeeService.findAllEmployee();
        if(employeeDtoList.isEmpty()){
            return ResponseEntity.noContent().build();
        }
       return ResponseEntity.ok(employeeDtoList);
    }
}
