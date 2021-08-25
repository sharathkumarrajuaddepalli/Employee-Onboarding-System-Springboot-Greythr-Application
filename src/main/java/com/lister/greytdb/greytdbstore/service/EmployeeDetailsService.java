package com.lister.greytdb.greytdbstore.service;

import com.lister.greytdb.greytdbstore.entity.EmployeeDetails;
import com.lister.greytdb.greytdbstore.repository.EmployeeDetailsRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDetailsService {
    private final EmployeeDetailsRepository employeeDetailsRepository;

    public EmployeeDetailsService(EmployeeDetailsRepository employeeDetailsRepository) {
        this.employeeDetailsRepository = employeeDetailsRepository;
    }

    public EmployeeDetails saveEmployee(EmployeeDetails employeeDetails) {
        return employeeDetailsRepository.save(employeeDetails);
    }
}
