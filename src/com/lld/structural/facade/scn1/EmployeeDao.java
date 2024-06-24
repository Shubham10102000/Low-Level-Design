package com.lld.structural.facade.scn1;

public class EmployeeDao {
    public void insert() {
        // insert into employee table
    }
    public void updateEmployee() {
        // updating employee name
    }
    public Employee getEmployeeDetails(String emailId) {
        // get Employee details based on emailId
        return new Employee();
    }

    public Employee getEmployeeDetails(int empId) {
        // get Employee details based on emailId
        return new Employee();
    }
}
