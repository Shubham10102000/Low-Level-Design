package com.lld.structural.proxy;

import com.lld.structural.facade.scn1.Employee;

public interface EmployeeDao {
    void create(String client, Employee obj) throws Exception;
    void delete(String client, int empId) throws Exception;
    Employee get(String client, int empId) throws Exception;
}
