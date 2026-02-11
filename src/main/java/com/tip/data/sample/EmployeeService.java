package com.tip.data.sample;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    EmployeeRepository employeeRepository;

    EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        return  employeeRepository.save(employee);
    }
}
