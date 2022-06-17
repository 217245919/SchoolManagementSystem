package za.ac.cput.school_management.factory.employee;

/*
    EmployeeAddressFactory.java
    Entity for the Employee
    Wajedien Samuels (216287820)
    10 June 2022
 */

import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.domain.lookup.Address;

public class EmployeeAddressFactory {

    public static EmployeeAddress createEmployeeAddress(String staffId, Address address) {

        EmployeeAddress employeeAddress = new EmployeeAddress.Builder()
                .setStaffId(staffId)
                .setAddress(address)
                .build();
        return employeeAddress;
    }
}
