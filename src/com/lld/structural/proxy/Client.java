package com.lld.structural.proxy;

public class Client {
    public static void main(String[] args) throws Exception {
        EmployeeDao employeeDao = new EmployeeDaoProxy();
        employeeDao.get("Admin",2132312);
    }
}
