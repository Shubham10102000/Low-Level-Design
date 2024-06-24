package com.lld.structural.proxy;

import com.lld.structural.facade.scn1.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void create(String client, Employee obj) throws Exception {
        // create new employee
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        // delete employee with empId
    }

    @Override
    public Employee get(String client, int empId) throws Exception {
        // get employee with empId
        return null;
    }
}
