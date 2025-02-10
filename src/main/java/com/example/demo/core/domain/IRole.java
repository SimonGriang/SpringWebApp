package com.example.demo.core.domain;

import java.util.List;

public interface IRole {
    int getRoleId();
    String getRoleName();
    void setRoleName();
    boolean roleNameUnique(String roleName);
    List<Permission> getPermissions();
    boolean addPermission(Permission permission);
    boolean containsPermission(Permission permission);
}
