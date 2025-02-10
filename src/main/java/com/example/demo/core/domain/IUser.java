package com.example.demo.core.domain;

import java.time.LocalDate;

public interface IUser {
    int getUserId();
    void setEmployeeNumber(String number);
    String getEmployeeNumber();
    boolean passwordIsValid();
    String getFirstName();
    void setFirstName(String firstName);
    String getSurname();
    void setSurname(String surname);
    String getWholeName();
    IRole getRole();
    void setRole(IRole role);
    ITeam getTeam();
    void setTeam(ITeam team);
    IWorkEntry getWorkentries(LocalDate startDate, LocalDate endDate);
    boolean addWorkEntry(LocalDate date);
    ICompany getCompany();
    void setCompany(ICompany company);
    float getDailyContractedHours();
    void setDailyContractedHours(float contractedHours);
}
