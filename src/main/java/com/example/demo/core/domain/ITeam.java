package com.example.demo.core.domain;

import java.util.List;

public interface ITeam {
    int getTeamId();
    String getTeamName();
    void setTeamName();
    List<IUser> getTeamMembers();
    void addTeamMember(IUser user);
    boolean deleteTeamMember(IUser user);
    boolean isTeamMember(IUser user);
}
