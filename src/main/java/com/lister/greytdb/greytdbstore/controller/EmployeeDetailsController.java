package com.lister.greytdb.greytdbstore.controller;

import com.lister.greytdb.greytdbstore.entity.EmployeeDetails;
import com.lister.greytdb.greytdbstore.service.EmployeeDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeDetailsController {
    private final EmployeeDetailsService employeeDetailsService;

    public EmployeeDetailsController(EmployeeDetailsService employeeDetailsService) {
        this.employeeDetailsService = employeeDetailsService;
    }

    @CrossOrigin
    @PostMapping("/listeremployee")
    public ResponseEntity<Object> saveEmployeeDetails(@RequestBody EmployeeDetails employeeDetails){
        return ResponseEntity.ok(employeeDetailsService.saveEmployee(employeeDetails));
    }
}
