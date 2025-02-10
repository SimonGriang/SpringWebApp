package com.example.demo.core.domain;

import java.util.List;

public interface ICompany {
    String getCompanyName();
    void setCompanyName();
    List<IUser> getEmployees();
    List<IUser> getAdmins();
    void addEmployee (IUser employee);
    boolean deleteEmployee(IUser employee);
    int getCompanyId();
}
