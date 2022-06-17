package za.ac.cput.school_management.service.employee.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.repository.employee.EmployeeAddressRepository;
import za.ac.cput.school_management.service.employee.EmployeeAddressService;

/*
Lyle Haines - 217245919
ADP3 JUNE ASSIGNMENT
EmployeeAddressServiceIMPL.java
*/

public class EmployeeAddressServiceIMPL implements EmployeeAddressService {

    private static EmployeeAddressService employeeAddressService = null;

    @Autowired
    private EmployeeAddressRepository employeeAddressRepository;

    private EmployeeAddressServiceIMPL(){

    }

    public static EmployeeAddressService getEmployeeAddressService() {
        if (employeeAddressService == null) employeeAddressService = new EmployeeAddressServiceIMPL();
        return employeeAddressService;
    }

    @Override
    public Employee create(Employee employee) {
        return null;
    }

    @Override
    public Employee read(String s) {
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
