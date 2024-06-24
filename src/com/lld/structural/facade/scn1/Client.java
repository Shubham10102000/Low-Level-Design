package com.lld.structural.facade.scn1;

public class Client {
    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade();
        Employee employeeDetails = employeeFacade.getEmployeeDetails(1);
    }
}
