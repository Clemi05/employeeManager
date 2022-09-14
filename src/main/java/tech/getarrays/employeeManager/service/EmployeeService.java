package tech.getarrays.employeeManager.service;

import tech.getarrays.employeeManager.repo.EmployeeRepo;

public class EmployeeService {
    private final EmployeeRepo employeeRepo;


    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
}
