package com.technodev.erp.users.interfaces;

import com.technodev.erp.users.entities.Role;

import java.util.List;

public interface IRole {
    Role add(Role role);
    Role edit(Role role);
    int delete(int id);
    Role findById(int id);
    Role findByRole(String role);
    List<Role> findAll();
    boolean isExist(String role);
}
