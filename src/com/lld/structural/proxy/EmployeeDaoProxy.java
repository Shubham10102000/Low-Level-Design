package com.lld.structural.proxy;

import com.lld.structural.facade.scn1.Employee;

public class EmployeeDaoProxy implements EmployeeDao {
    private final EmployeeDao employeeDao;
    EmployeeDaoProxy () {
        employeeDao = new EmployeeDaoImpl();
    }
    @Override
    public void create(String client, Employee obj) throws Exception {
        if (client.equalsIgnoreCase("ADMIN")) {
            employeeDao.create(client,obj);
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        if (client.equalsIgnoreCase("ADMIN")) {
            employeeDao.delete(client,empId);
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int empId) throws Exception {
        if (client.equalsIgnoreCase("ADMIN")) {
            return employeeDao.get(client,empId);
        }
        throw new Exception("Access Denied");
    }
}
