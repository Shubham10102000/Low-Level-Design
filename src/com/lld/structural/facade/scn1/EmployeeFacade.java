package com.lld.structural.facade.scn1;

public class EmployeeFacade {
    private final EmployeeDao employeeDao;

    public EmployeeFacade() {
        // take the responsibility to create object
        this.employeeDao = new EmployeeDao();
    }

    public void insert() {
        employeeDao.insert();
    }

    public Employee getEmployeeDetails(int empId) {
        return employeeDao.getEmployeeDetails(empId);
    }
}
